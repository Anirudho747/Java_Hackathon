package week2;

import java.util.Scanner;

public class Day9_returnRepeatingChar {

    static String str;
    static String[] chr;
    static int flg=0;

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        str = str.replaceAll("[^a-zA-z0-9]","");
        chr = str.split("");
        findRepeating(chr);
    }

    static void findRepeating(String[] strArray)
    {

        for(int i=0;i<strArray.length;i++)
        {
            flg=1;
   //         System.out.println(strArray[i] +" "+25);
            for(int j=i+1;j< strArray.length-1;j++)
            {
                //System.out.println(strArray[i]+"-"+strArray[j] +"----"+28);
                if(strArray[i].equalsIgnoreCase(strArray[j]))
                {
                    flg++;
    //                System.out.println("-_______________________________"+flg);
                    break;
                }
            }
            if(flg>1)
            {
                System.out.println(strArray[i]+" occurs more than once");
                break;
            }
        }

        if(flg==1)
        {
            System.out.println("No character occurs more than once");
        }
    }
}
