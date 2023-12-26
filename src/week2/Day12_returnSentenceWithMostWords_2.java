package week2;

import java.util.List;

public class Day12_returnSentenceWithMostWords_2 {

    static String[] strArray=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

    static List<Integer> al;

    public static void main(String[] args)
    {
        getMaxWords(strArray);
    }

    static void getMaxWords(String[] arrayStr)
    {
        int max=0,pos = 0;

        for(int i=0;i< arrayStr.length;i++)
        {
            int len = arrayStr[i].split(" ").length;
            if(max<len)
            {
                max = len;
                pos = i;
            }
        }

        System.out.println("String at "+(pos+1)+" is the longest with "+max+" words");
    }
}
