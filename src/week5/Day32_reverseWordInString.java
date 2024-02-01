package week5;

import java.util.Stack;

public class Day32_reverseWordInString {

    static String str12 = "the sky is blue";
    static String str13 = "  hello world  ";
    static String str1 = "a good   example";

    public static void main(String[] args) {

        System.out.println(checkBrackets());

    }

    static String checkBrackets()
    {
        String strNew="";
        str1 = str1.trim();
        String[] strArray =str1.split("\\s+");

        for(int i=strArray.length-1;i>=0;i--)
        {
            strNew+=strArray[i]+" ";
            //System.out.print(strArray[i]);
        }

        return strNew;
    }
}
