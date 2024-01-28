package week5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Day29_LongestSubstringWithoutRepetition {

    static String str12 = "abcabcbb";
    static String str13 = "bbbbb";
    static String str1 = "pwwakew";


    public static void main(String[] args) {
        int len = getLength();
        System.out.println(len);


    }

    public static int getLength(){

        int maxLength=0,left=0;
        Set<Character> hs = new HashSet<>();

        for(int i=0;i<str1.length();i++)
        {
            if(!hs.contains(str1.charAt(i)))
            {
                hs.add(str1.charAt(i));
                maxLength=Math.max(maxLength,i-left+1);
            }
            else
            {
            while(hs.contains(str1.charAt(i)))
            {
                hs.remove(str1.charAt(left));
                left++;
            }
                hs.add(str1.charAt(i));
            }
        }
        return maxLength;
    }
}
