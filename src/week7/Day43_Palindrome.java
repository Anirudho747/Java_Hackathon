package week7;

import java.util.Scanner;

public class Day43_Palindrome {

    static String str1;
    static int n;

    public static void main(String[] args)
    {
        stringPalindrome();
        numberPalindrome();
    }

    static void numberPalindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();

        int rem=0,cmpr=0,newnum=n;
        while(n>0)
        {
            cmpr = (cmpr*10)+(n%10);
            n=n/10;
        }

        System.out.print(cmpr);

        if(newnum==cmpr)
        {
            System.out.print("Its a palinndrome");
        }
        else {
            System.out.print("Not a palinndrome");
        }

    }

    static void stringPalindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str1 = sc.nextLine();

        String str2="";

        String[] strArray = str1.split("");

        for(int i=strArray.length-1;i>=0;i--)
        {
            str2 = str2.concat(strArray[i]);
        }

        if(str2.equalsIgnoreCase(str1))
        {
            System.out.print("Its a palinndrome");
        }
        else {
            System.out.print("Its NOT a palinndrome");
        }


    }
}
