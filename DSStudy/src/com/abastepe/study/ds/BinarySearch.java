package com.abastepe.study.ds;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)  {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)  {
                return mid;
            }
            if(arr[mid] < target)  {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println("Binary search : " + BinarySearch.binarySearch(new int[] {1, 3, 5, 7, 8}, 5));
        System.out.println("Binary search : " + BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 0));
        System.out.println("Binary search : " + BinarySearch.binarySearch(new int[] {2, 8, 89, 120, 1000}, 120));
    }
}
