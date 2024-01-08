package week4;

import java.util.Scanner;

public class Day22_moveZeroes {
    static int arr[] = new int[7];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 7 integer values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        moveZero();
    }

    static void moveZero()
    {
        int cntr=0,temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp = arr[cntr];
                arr[cntr]=arr[i];
                arr[i]= temp;
                cntr++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
