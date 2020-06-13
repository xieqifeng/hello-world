package com.juvenxu.mvnbook.helloworld.demo;

import java.util.Arrays;

public class SearchDuplicatedNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 2, 5, 4 };
        for (int i = 0; i < arr.length;) {
            System.out.print("输入：" + Arrays.toString(arr) + "\t");
            System.out.print("i=" + i + "\t");
            if (arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                System.out.print("数字和索引相等\t");
                i++;
            }
            System.out.println("输出：" + Arrays.toString(arr));
            System.out.println();
            if (arr[i] < i + 1) {
                System.out.println("重复数：" + arr[i]);
                break;
            }
        }
    }
}