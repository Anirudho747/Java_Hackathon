package week6;

import java.util.Scanner;

public class Day42_StringReverse {

    static String str;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();

        revStringandWord(str);
        revWord(str);
    }

    static void revStringandWord(String str1)
    {
        String[] strArray = str1.split("");

        for(int i= strArray.length-1;i>=0;i--)
        {
            System.out.print(strArray[i]+" ");
        }
        System.out.println();
    }

    static void revWord(String str1)
    {
        String[] strArray = str1.split(" ");

        for (int i = 0; i <= strArray.length-1; i++)
        {
            for(int j=strArray[i].length()-1;j>=0;j--)
            {
               System.out.print(strArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

}
