package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day14_returnSumOfUnique {

    static int[] arr = new int[7];
    static int sum=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        sumUnique(arr);
    }

    static void sumUnique(int[] ar)
    {
        int unique,sum=0;

        for(int i=0;i<ar.length;i++)
        {
          unique=0;
         for(int j=i+1;j< ar.length;j++)
         {
             if((ar[i]==ar[j]) && (ar[i]!=-864213579))
             {
                 unique++;
                 ar[j]=-864213579;
             }
         }

         if((unique==0) && (ar[i]!=-864213579))
         {
             sum += ar[i];
         }
        }

        System.out.print("Sum is "+sum);
    }
}
