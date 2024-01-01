package week3;

import java.util.Scanner;

public class Day18_returnMaxSumSubarray {

    static int[] arr = new int[]{-2,-1,-3,4,-1,2,1,-5,4};
    static int sum=0;
    public static void main(String[] args)
    {
        findMaxSum();
    }

    static void findMaxSum()
    {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
