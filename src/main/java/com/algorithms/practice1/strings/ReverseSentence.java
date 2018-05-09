/**
 * @author Rohith Raj 2/26/2018
 */
package com.algorithms.practice1.strings;

public class ReverseSentence {

    public static void reverseSentence(char[] ch, int n) {
        reverse(ch, 0, n - 1);
        int j = 0, i = 0;
        while (i < n) {
            if (ch[i] == ' ') {
                reverse(ch, j, i - 1);
                j = i + 1;
            }
            i++;
        }
        reverse(ch, j, i - 1);
    }

    public static void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "This is a class";
        char[] ch = s.toCharArray();
        int n = s.length();
        reverseSentence(ch, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
    }
}
