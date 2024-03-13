package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day38_SecondSmallestNumber
{
    static Integer[] arr = {7,5,11,2,0,14};

    public static void main(String[] args)
    {
        secondSmallest(arr);
    }

    static void secondSmallest(Integer[] arry)
    {
        List<Integer> n1 = new ArrayList<>();

        Collections.addAll(n1,arry);

        Collections.sort(n1);

        System.out.println(n1.get(1));
        System.out.println(n1.get(n1.size()-2));
    }
}
