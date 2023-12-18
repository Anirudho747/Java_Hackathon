package week1;

import java.util.Scanner;

public class Day2_returnIfPalindrome {

    static String str="";

    public static void main(String[] args)
    {
        System.out.println("Enter String");

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        checkPalindrome(str);
    }

    public static void checkPalindrome(String str)
    {
        String[] strArray = str.split("");

        int isEqual = 1;

        for(int i=0;i<(strArray.length/2);i++)
        {
                if(!(strArray[i].equalsIgnoreCase(strArray[strArray.length-1-i])))
                {
                   isEqual=0;
                   break;
                }

        }

        if (isEqual==1) System.out.print("Its a Palindrome");
        else System.out.print("Not a Palindrome");
    }
}
