package week4;

import java.util.Scanner;

public class Day23_findElementsWithEqualSum {
    static int arr[] = new int[4];
    static int target;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 7 integer values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        target = sc.nextInt();
        moveZero();
    }

    static void moveZero()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+(i+1)+","+(j+1)+"]");
                    break;
                }
            }
        }
    }
}
