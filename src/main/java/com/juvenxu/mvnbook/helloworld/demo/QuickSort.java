package com.juvenxu.mvnbook.helloworld.demo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] nums = { 5, 11, 2, 0, 3, 3 };
        int[] nums1 = { 2, 1, 1, 8, 3, 9, 4, 5, 7 };
        int[] nums2 = { 2, 0, 4, 3, 3, 4 };
        int[] nums3 = { 3, 2 };
        quickSort.quickSort(nums3, 0, nums3.length - 1);
        // System.out.println(quickSort.partition(nums3, 0, nums3.length-1));
        System.out.println(Arrays.toString(nums3));
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l >= r)
            return;
        int pivot = partition(nums, l, r);
        quickSort(nums, l, pivot - 1);
        quickSort(nums, pivot + 1, r);
    }

    public int partition(int[] nums) {
        int pivot = nums.length - 1;
        int i = 0;
        int j;
        for (j = 0; j < pivot; j++) {
            System.out.println("i=" + i + " j=" + j);
            if (nums[j] < nums[pivot]) {
                swap(nums, i, j);
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println("i=" + i + " j=" + j);
        swap(nums, i, pivot);
        return i;
    }

    /**
     * 双指针对撞
     * 
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = low;
        int pivotValue = arr[pivot];
        while (low < high) {
            System.out.print("low=" + low + " high=" + high);
            while (low < high && arr[high] >= pivotValue)
                high--;
            while (low < high && arr[low] <= pivotValue)
                low++;
            System.out.print(" low=" + low + " high=" + high);
            swap(arr, low, high);
        }
        swap(arr, pivot, low);
        System.out.println(" " + Arrays.toString(arr));
        return low;
    }

    public void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    int mypartition(int[] arr, int low, int high) {
        int pivot = arr[low];// 选第一个元素作为枢纽元
        while (low < high) {
            while (low < high && arr[high] >= pivot)
                high--;
            arr[low] = arr[high];// 从后面开始找到第一个小于pivot的元素，放到low位置
            while (low < high && arr[low] <= pivot)
                low++;
            arr[high] = arr[low];// 从前面开始找到第一个大于pivot的元素，放到high位置
        }
        arr[low] = pivot;// 最后枢纽元放到low的位置
        return low;
    }

    int lastPivotPartition(int[] arr, int low, int high) {
        int pivot = arr[high];// 选最后一个元素作为枢纽元
        int location = low - 1;// location指向比pivot小的元素段的尾部
        for (int i = low; i < high; i++)// 比枢纽元小的元素依次放在前半部分
            if (arr[i] < pivot)
                swap(arr, i, ++location);
        swap(arr, high, location + 1);
        return location + 1;
    }
}