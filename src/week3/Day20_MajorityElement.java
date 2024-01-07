package week3;

import java.util.Scanner;

public class Day20_MajorityElement {

    static int arr[] = new int[7];
    static int majCount = arr.length/2;

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
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            cnt=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]==arr[j]) && (arr[i]!=-975312468))
                {
                    cnt++;
                    arr[j] = -975312468;
                }
            }
            if(cnt>majCount)
            {
                System.out.println(arr[i]+" is a majority element in given array");
                break;
            }
        }
    }


}
