package week1;

import java.util.Scanner;

public class Day4_checkHappyNumber {

    static int num;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        isHappy(num); //19 for positive case
    }

    static void isHappy(int n)
    {
        int s=0;int r = 0;int q = 0;int i=0;int t=n;

       for(int j=1;j<5;j++)
       {
           System.out.println("Iteration number "+j);
           while ((n > 0)) {
               i++;
               q = n / 10;
               r = n % 10;
               s = s + (r * r);
               n = q;
               if (s == 1) {
                   System.out.print("Eureka !! Its a Happy Number");
                   break;
               }
               System.out.println(i+" loop " + n + " sum " + s);
           }
           n=s;
           s=0;
       }
    }
}
