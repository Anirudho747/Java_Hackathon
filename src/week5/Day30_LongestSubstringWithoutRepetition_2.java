package week5;

import java.util.HashSet;
import java.util.Set;

public class Day30_LongestSubstringWithoutRepetition_2 {

    static String str12 = "abcabcbb";
    static String str13 = "bbbbb";
    static String str1 = "pwwkew";


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
                maxLength=Math.max(maxLength,hs.size());
            }
            else
            {
                    hs.remove(str1.charAt(left));
            }
        }
        return maxLength;
    }

}
