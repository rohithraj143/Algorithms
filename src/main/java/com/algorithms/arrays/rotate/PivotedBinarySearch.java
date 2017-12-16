package com.algorithms.arrays.rotate;

public class PivotedBinarySearch {

    private static int pivotedBinarySearch(int[] arr, int size, int key) {
        int pivot = findPivot1(arr, 0, size - 1);

        if (arr[pivot] == key) {
            return pivot;
        }

        int i = binarySearch(arr, pivot + 1, size - 1, key, 1);
        if (i != -1) {
            return i;
        } else {
            return binarySearch(arr, 0, pivot - 1, key, 0);
        }
    }


    private static int binarySearch(int[] arr, int l, int r, int key, int order) {

        if (l > r) {
            return -1;
        }

        int m = (l + r) / 2;

        if (arr[m] == key) {
            return m;
        }

        if (order == 0) {
            if (arr[m] < key) {
                return binarySearch(arr, m + 1, r, key, 0);
            } else {
                return binarySearch(arr, l, m - 1, key, 0);
            }
        } else {
            if (arr[m] > key) {
                return binarySearch(arr, m + 1, r, key, 1);
            } else {
                return binarySearch(arr, l, m - 1, key, 1);
            }
        }


    }

    private static int findPivot(int[] arr, int low, int high) {

        if (low > high) {
            return -1;
        }

        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;

        if (high > mid && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (low < mid && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        } else {
            return findPivot(arr, mid + 1, high);
        }
    }

    private static int findPivot1(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }

        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;

        if (mid < high && mid > low && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return mid;
        }

        if (arr[mid] > arr[mid + 1]) {
            return findPivot1(arr, low, mid - 1);
        }

        return findPivot1(arr, mid + 1, high);
    }

    private static int outOfTheBoxFindElementMethod(int[] arr, int low, int high, int key) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] >= arr[mid-1]) {

            if (key >= arr[low] && key < arr[mid] ||
                    key <= arr[low] && key > arr[mid]) {
                return outOfTheBoxFindElementMethod(arr, low, mid - 1, key);
            } else if (key < arr[mid] && key >= arr[high]) {
                return outOfTheBoxFindElementMethod(arr, mid + 1, high, key);
            }
            return outOfTheBoxFindElementMethod(arr, mid + 1, high, key);
        }

        if (key < arr[mid] && key >= arr[high]) {
            return outOfTheBoxFindElementMethod(arr, mid + 1, high, key);
        }

        return outOfTheBoxFindElementMethod(arr, low, mid - 1, key);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{39, 51, 71, 84, 92, 93, 149, 154, 158, 173, 178, 193, 216, 217, 231, 243,
                410, 425, 429, 459, 476, 482, 483, 540, 542, 567, 586, 587, 593, 746, 807, 823, 833, 839, 850, 873,
                919, 923, 975, 1000, 1001, 994, 992, 990, 989, 987, 984, 980, 979, 976, 970, 965, 960, 958, 955, 945, 939,
                928, 915, 910, 909, 905, 896, 889, 885, 879, 874, 872, 870, 862, 861, 852, 846, 841, 838, 829, 828,
                826, 825, 821, 820, 819, 817, 816, 815, 814, 812, 811, 804, 803, 801, 800, 790, 784, 783, 780, 778,
                774, 765, 764, 763, 761, 758, 756, 753, 750, 738, 733, 728, 725, 724, 716, 712, 711, 708, 705, 704,
                701, 699, 697, 686, 685, 684, 683, 682, 680, 673, 670, 666, 663, 658, 650, 648, 645, 643, 640, 639,
                634, 626, 615, 613, 603, 594, 592, 588, 584, 583, 582, 580, 579, 569, 565, 560, 559, 558, 557, 555,
                547, 541, 539, 538, 534, 533, 532, 526, 520, 510, 509, 508, 505, 498, 488, 487, 485, 481, 475, 474,
                472, 470, 464, 460, 456, 452, 451, 447, 446, 443, 441, 439, 432, 430, 427, 424, 415, 409, 408, 401,
                398, 394, 393, 388, 386, 381, 380, 379, 376, 370, 367, 366, 362, 358, 357, 355, 354, 349, 348, 342,
                337, 333, 331, 330, 324, 320, 318, 316, 312, 308, 306, 305, 304, 302, 301, 296, 291, 280, 273, 271,
                270, 269, 263, 259, 258, 255, 246, 242, 239, 236, 228, 224, 223, 222, 221, 220, 213, 208, 207, 205,
                203, 202, 196, 191, 190, 187, 185, 184, 180, 170, 169, 161, 160, 155, 150, 147, 141, 137, 135, 132,
                130, 129, 122, 121, 117, 116, 107, 102, 96, 95, 94, 90, 89, 86, 81, 79, 78, 77, 73, 67, 61, 59, 56,
                52, 49, 38, 27, 23, 19, 14, 12, 11, 4};
        int key = 862;
        int size = arr.length;
        System.out.println(arr[findPivot1(arr, 0, size - 1)]);
        System.out.println(pivotedBinarySearch(arr, size, key) != -1 ?
                "The key " + key + " is found at index :" + pivotedBinarySearch(arr, size, key) :
                "The key " + key + " is not found");

        System.out.println(outOfTheBoxFindElementMethod(arr, 0, size - 1, key) != -1 ?
                "The key " + key + " is found at index :" + pivotedBinarySearch(arr, size, key) :
                "The key " + key + " is not found");
    }
}
