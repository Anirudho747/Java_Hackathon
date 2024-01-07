package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Day21_MajorityElement_2 {
    static int arr[] = new int[7];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 7 integer values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        findMajor();
    }

    static void findMajor()
    {
        Arrays.sort(arr);
        int n = arr.length/2;
        System.out.println(arr[n]+" is the majority element");
    }
}
