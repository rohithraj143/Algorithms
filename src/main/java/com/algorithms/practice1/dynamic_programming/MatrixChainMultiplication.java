package com.algorithms.practice1.dynamic_programming;

public class MatrixChainMultiplication {

    private int[][] m, s;

    private int minimumMultiplicationsMemoized(int[] p, int n) {
        m = new int[n][n];
        return lookupChain(m, p, 0, n - 1);
    }

    private int lookupChain(int[][] m, int[] p, int i, int j) {
        if (m[i][j] != 0 || i == j) {
            return m[i][j];
        } else {
            for (int k = i; k < j; k++) {
                m[i][j] = Integer.MAX_VALUE;
                int q = lookupChain(m, p, i, k)
                        + lookupChain(m, p, k + 1, j)
                        + p[i] * p[k + 1] * p[j + 1];
                if (q < m[i][j]) {
                    m[i][j] = q;
                }
            }
        }
        return m[i][j];
    }

    private void minimumMultiplications(int[] p, int n) {
        m = new int[n][n];
        s = new int[n][n];


        for (int l = 1; l <= n; l++) {
            for (int i = 0, j = l; i < n - l; i++, j++) {
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] p = {2, 8, 7, 2, 10};
        int n = p.length - 1;
        MatrixChainMultiplication multiplication = new MatrixChainMultiplication();
        multiplication.minimumMultiplications(p, n);
        System.out.println(multiplication.m[0][n - 1]);
        System.out.println(multiplication.s[0][n - 1]);

        MatrixChainMultiplication multiplication1 = new MatrixChainMultiplication();
        System.out.println(multiplication1.minimumMultiplicationsMemoized(p, n));
        //System.out.println(multiplication1.m[0][n - 1]);
        //System.out.println(multiplication1.s[0][n - 1]);


    }
}
