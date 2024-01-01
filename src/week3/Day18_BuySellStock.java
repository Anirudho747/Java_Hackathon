package week3;

import java.util.Scanner;

public class Day18_BuySellStock {

    static int[] arr = new int[7];
    static int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,diff=0;
    static int minpoint,maxpoint;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for day");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        getDiff();
    }

    static void getDiff()
    {
        for(int i=0;i<arr.length;i++)
        {
                if (min > arr[i])
                {
                    min = arr[i];
                    minpoint = i;
                }
                if(minpoint==arr[arr.length-1])
                {
                    System.out.println("Can't earn profit");
                    break;
                }
                if (max < arr[i])
                {
                max = arr[i];
                maxpoint = i;
                }

        }
    }
}
