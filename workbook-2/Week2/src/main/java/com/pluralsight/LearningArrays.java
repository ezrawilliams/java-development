package com.pluralsight;
/*
In this lesson we will learn about special data structures - Arrays
Arrays - special data structure that holds more than one value of the same type
In Java, array indexes are zero-based - 0... one less than the size of the array:
10 elements - 0,1, 2, 3, 4, 5, 6, 7, 8, 9
When an array is created the size is FIXED
 */
public class LearningArrays {
    public static void main(String[] args) {
        int[] nums = new int[10];// 0 0 0 0 0 0 0 0 0 0
        int nums2[] = {63, 65, 60, 53, 58, 37, 35, 31};

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i] + " ");// nums[0](63), nums[1](65),
            // nums[2](60), nums[3](53), nums[4](58), nums[5](37), nums[6](35), nums[7](31)
        }
        System.out.println(nums2[5]);

        for (int i = 0; i < nums2.length; i++) {
            nums[i]=nums2[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
