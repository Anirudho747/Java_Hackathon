package week4;

import java.util.Scanner;

public class Day24_sortColors {

    static int arr[] = new int[]{2, 0, 2, 1, 1, 0};


    public static void main(String[] args) {
        sortColors();
    }

    static void sortColors()
    {
        int temp=0,zeroCnt=0,oneCnt=arr.length-1,onetemp=1,i=0;
        while( i<=oneCnt)
        {
            if(arr[i]==0)
            {
                temp = arr[zeroCnt];
                arr[zeroCnt] =arr[i] ;
                arr[i] = temp;
                zeroCnt++;
            }
            else if(arr[i]==1)
            {
                onetemp = arr[oneCnt];
                arr[oneCnt] =arr[i] ;
                arr[i] = onetemp;
                oneCnt--;
            }
            else {
                i++;
                 }
        }
        System.out.println("----------");
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}