package com.algorithms.arrays.arrangements_rearrangements;

import java.awt.*;

public class BitonicSubarray {

    public static int getBitonicSubarrayLength(int[] arr, int n) {

        int start = 0, maxLen = -1, j = 0;

        while (j < n - 1) {

            while (j < n - 1 && arr[j] < arr[j + 1]) {
                j++;
            }

            while (j < n - 1 && arr[j] > arr[j + 1]) {
                j++;
            }

            maxLen = Math.max(maxLen, j - start + 1);
            start = j;

            if(j < n-1 && arr[j] == arr[j+1]) {
                start = ++j;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {521, 791, 925, 189, 764, 941, 852, 663, 830, 901, 714, 959, 579, 366, 8, 478, 201, 59, 440, 304,
                761, 358, 325, 478, 109, 114, 888, 802, 851, 461, 429, 994, 385, 406, 541, 112, 705, 836, 357, 73, 351,
                824, 486, 557, 217, 627, 358, 527, 358, 338, 272, 870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424,
                130, 230, 566, 560, 933, 297, 856, 54, 963, 585, 735, 655, 973, 458, 370, 533, 964, 608, 484, 912, 636,
                68, 849, 676, 939, 224, 143, 755, 512, 742, 176, 460, 826, 222, 871, 627, 935, 206, 784, 851, 399, 280,
                702, 194, 735, 638, 535, 557, 994, 177, 706, 963, 549, 882, 301, 414, 642, 856, 856, 143, 463, 612,
                878, 425, 679, 753, 444, 297, 674, 41, 314, 876, 73, 819, 611, 18, 933, 113, 696, 170, 832, 41, 489,
                686, 91, 498, 590, 991, 146, 354, 315, 652};
        long startTime = System.currentTimeMillis();
        System.out.println(getBitonicSubarrayLength(arr, arr.length));
        long endTime = System.currentTimeMillis();
        System.out.println("total time to execute is " + (endTime-startTime)*60/1000);
    }
}
