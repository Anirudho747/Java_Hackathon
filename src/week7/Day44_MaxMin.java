package week7;

import java.util.ArrayList;
import java.util.Collections;

public class Day44_MaxMin {

    static int[] num  = {8,3,2,1,9,7};

    public static void main(String[] args)
    {
        maxMinByCollection();
        maxMinByManual();
    }

    static void maxMinByCollection()
    {
        Integer[] num2 = new Integer[num.length];

        Integer j=0;

        for(int i=0;i<num.length;i++)
        {
            num2[j] = num[i];
            j++;
        }

        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al,num2);

        Collections.sort(al);

        System.out.println(al.get(0));
        System.out.println(al.get(al.size()-1));
    }

    static void maxMinByManual()
    {
        int temp=0;

        for(int i=0;i< num.length;i++)
        {
            for(int j=i+1;j< num.length;j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println(num[0]);
        System.out.println(num[num.length-1]);

    }

}
