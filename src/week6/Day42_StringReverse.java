package week6;

import java.util.Scanner;

public class Day42_StringReverse {

    static String str;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();

        revString(str);
    }

    static void revString(String str1)
    {
        String[] strArray = str.split("");

        for(int i= strArray.length-1;i>=0;i--)
        {
            System.out.print(strArray[i]+" ");
        }
    }
}
