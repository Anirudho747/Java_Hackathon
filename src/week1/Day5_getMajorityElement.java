package week1;

import java.util.Scanner;

public class Day5_getMajorityElement {

    static int[] arr = new int[7];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        returnMajority(arr);
    }

    static void returnMajority(int[] array)
    {
        int cnt=1;int flag=0;
        int maj = array.length/2;
        for(int i=0;i<array.length;i++)
        {
            cnt=1;
            //System.out.println(array[i]+" 28");
            for(int j=i+1;j<array.length;j++)
            {
              //  System.out.println(array[j]+" 31");
                if((array[i]==array[j]) && ((array[j]!=-1234567)))
                {
                //    System.out.println(array[i]+" - "+array[i]+" 34");
                    cnt++;
                    array[j] = -1234567;
                }

                //System.out.println(cnt+" 39");

                if (cnt > maj)
                {
                   System.out.println(array[i]+" is the majority element");
                   flag=1;
                   break;
                }
            }

                if(flag==1) break;
        }
    }
 }
