package week2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Day8_returnEmbeddedString {

    static String findInStr;
    static String findStr;

    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter String to find");
         findStr = sc.nextLine();
         System.out.println("Enter String to find in");
         findInStr = sc.nextLine();
         findSubstr(findStr,findInStr);
    }

    static void findSubstr(String findStr,String findInStr)
    {
        List<Character> list = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i < findStr.length(); i++)
            list.add(findStr.charAt(i));

        for(int i = 0; i < findInStr.length(); i++)
            if(list.contains(findInStr.charAt(i)))ans++;

        System.out.println(ans);

    }



}
