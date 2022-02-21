package com.chally.leetcode.demo;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {7,3,7,21,1,4,8,5,0};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){ //相邻两个元素作比较，如果前面元素大于后面，进行交换
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
