package week1;

import java.util.Scanner;

public class Day1_returnSquareRoot {

    static int num;

    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        returnSquareRoot(num);
    }

    public static void returnSquareRoot(int num)
    {
        int root=0;
        for(int i=1;i<num/2;i++)
        {
            if(i*i==num)
            {
                root=i;
                break;
            }
            else if(i*i>num)
            {
                root=i-1;
                break;
            }
        }
        System.out.println(root);
    }

}
