package week2;

import java.util.ArrayList;
import java.util.List;

public class Day11_returnSentenceWithMostWords {

    static int len;
    static String[] strArray=new String[]{"alice and bob love leetcode just so much", "i think so too", "this is great thanks very much"};

    static List<Integer> al;

    public static void main(String[] args)
    {
        getLength(strArray);
        getWords(strArray);
    }

    static void getLength(String[] arrayStr)
    {
        int[] lenArray = new int[arrayStr.length];
        for(int i=0;i< arrayStr.length;i++)
        {
            lenArray[i] = arrayStr[i].length();
        }

        for(int i=0;i< arrayStr.length;i++)
        {
            System.out.println(arrayStr[i]+"----"+lenArray[i]);
        }
    }

    static void getWords(String[] arrayStr)
    {
        al= new ArrayList<Integer>();

        for(int i=0;i< arrayStr.length;i++)
        {
            al.add(i,arrayStr[i].split(" ").length);
        }

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        findMax(al,arrayStr);

    }

    static void findMax(List<Integer> arrayL,String[] arrayStr)
    {
        int max = Integer.MIN_VALUE;int seq=0;

        for(int i=0;i<arrayL.size();i++)
        {
            if(arrayL.get(i)>max)
            {
                max = arrayL.get(i);
                seq = i;
            }
        }

        System.out.println("String having max word is "+arrayStr[seq]);

    }

}
