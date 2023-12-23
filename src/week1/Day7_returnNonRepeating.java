package week1;

import java.util.Scanner;

public class Day7_returnNonRepeating {

    static int[] ar;
    static int n;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in Array");
        n =sc.nextInt();
        System.out.println("Enter "+n+" elements of array");
        ar = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        checkNonRepeating(ar);
    }

    static void checkNonRepeating(int [] arr)
    {
        int cnt=0,flag=0;

        for(int i=0;i<arr.length;i++)
        {
            cnt=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]==arr[j]) && (arr[j]!=-1357924680) )
                {
                    cnt++;
                    flag++;
                    arr[j]=-1357924680;
                }
            }
            if ((arr[i]!=-1357924680) && (cnt==1))
            {
                System.out.println(arr[i]+" occurs "+cnt+" number of times");
                break;
            }
        }
    }
}
