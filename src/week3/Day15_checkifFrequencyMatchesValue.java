package week3;

import java.util.Scanner;

public class Day15_checkifFrequencyMatchesValue {

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

        findFrequency(arr);
    }

    static void findFrequency(int[] ar)
    {
        int frequency;

        for(int i=0;i<ar.length;i++)
        {
            frequency=1;
            for(int j=i+1;j< ar.length;j++)
            {
                if((ar[i]==ar[j]) && (ar[i]!=-864213579))
                {
                    frequency++;
                    ar[j]=-864213579;
                }
            }

            if((frequency==ar[i]) && (ar[i]!=-864213579))
            {
               System.out.println(ar[i]+" is a lucky number");
            }
        }
    }


}
