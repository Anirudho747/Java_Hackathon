package week1;

import java.util.Scanner;

public class Day3_returnIfNotTwice {

    static int[] arr = new int[7];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        detectCount(arr);
    }

    private static void detectCount(int[] n)
    {
        int cnt=0;

        for(int i=0;i<arr.length;i++)
        {
            cnt=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]==arr[j]) & (arr[j]!=-234567))
                {
                    cnt++;
                    arr[j]=-234567;
                }
            }
            if((cnt<2) & (arr[i]!=-234567))
            {
                System.out.print(arr[i]+" occurs less than twice");
            }
        }
    }
}
