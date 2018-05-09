/**
 * @author Rohith Raj 2/26/2018
 */
package com.algorithms.practice1.strings;

public class RemoveDuplicates {

    public static int removeDup(char[] ch, int n) {

        if (ch == null) {
            return -1;
        }

        int i = 0;
        char[] hash = new char[255];

        for (int j = 0; j < n; j++) {
            char c = ch[j];
            if (hash[c] == 0) {
                hash[c]++;
                ch[i] = ch[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        String s = "gaadbbaaggaij";
        char[] ch = new char[s.length()];
        for(int i = 0; i< s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        int n = removeDup(ch, ch.length);
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
    }
}
