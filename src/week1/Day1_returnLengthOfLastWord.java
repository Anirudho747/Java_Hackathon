package week1;

import java.util.Scanner;

public class Day1_returnLengthOfLastWord {
    static String wrd;

    public static void main(String[] args) {

        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        wrd = sc.nextLine();

  //      lengthOfAllWords(wrd);
        findTheLongestWord(wrd);

    }

    public static void lengthOfAllWords(String wrd)
    {
        String[] wrdArray = wrd.split(" ");

        for(int i=0;i<wrdArray.length;i++)
        {
            System.out.println(wrdArray[i]);
            System.out.println(wrdArray[i].length());
        }
    }


    public static void findTheLongestWord(String wrd)
    {
        String[] wrdArray = wrd.split(" ");
        int[] cntArray = new int[wrdArray.length];

        for(int i=0;i<wrdArray.length;i++)
        {
 //           System.out.println(wrdArray[i]);
 //
            //           System.out.println(wrdArray[i].length());
            cntArray[i] = wrdArray[i].length();
        }

        int maxPos = 0;
        int maxVal = cntArray[maxPos];

        for(int i=0;i<cntArray.length-1;i++)
        {
                System.out.println(cntArray[i] + "   47");
                System.out.println(cntArray[i+1] + "   48");
                System.out.println((maxPos) + "   49");

                if (maxVal < cntArray[i+1])
                {
                    maxPos = i+1;
                    System.out.println((maxPos) + "   53");
                }

        }

        System.out.println("Word present at "+maxPos+" is the longest");
    }
}
