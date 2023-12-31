package week3;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Day17_returnDistanceToClosestOccurence {

    static String str1="loveleetcode";
    static String[] strArray;
    static int[] intArray;
    static int[] revIntArray;
    static int[] ansArray;

    static String find = "e";
    public static void main(String[] args)
    {
        strArray = str1.split("");
        intArray = new int[strArray.length];
        revIntArray = new int[strArray.length];
        ansArray = new int[strArray.length];
        getDistance();
    }

    static void getDistance()
    {

        Arrays.fill(intArray,Integer.MAX_VALUE);
        Arrays.fill(revIntArray,Integer.MAX_VALUE);

        int runningDis = Integer.MAX_VALUE;

        for(int i=0;i<strArray.length;i++)
        {
         if(strArray[i].equalsIgnoreCase(find))
         {
             runningDis = 0;
             intArray[i] = runningDis;
         }
         else if(runningDis!=Integer.MAX_VALUE)
            {
                runningDis++;
                intArray[i] = runningDis;
            }
        }

        runningDis = Integer.MAX_VALUE;

        for(int i=strArray.length-1;i>=0;i--)
        {
            if(strArray[i].equalsIgnoreCase(find))
            {
                runningDis = 0;
                revIntArray[i] = runningDis;
            }
            else if(runningDis!=Integer.MAX_VALUE)
            {
                runningDis++;
                revIntArray[i] = runningDis;
            }
        }

        for(int i=0;i<strArray.length;i++) {
            System.out.print(strArray[i] + "  ");
        }

        System.out.println();

        for(int i=0;i<strArray.length;i++)
        {
            ansArray[i] = Math.min(intArray[i],revIntArray[i]);
            System.out.print(ansArray[i]+"  ");
        }

    }


}
