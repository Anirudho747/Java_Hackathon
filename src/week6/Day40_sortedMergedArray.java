package week6;

import java.util.*;

public class Day40_sortedMergedArray {

    static Integer[] arr1 = {10,20,30,40,50};
    static Integer[] arr2 = {9,18,20,36,45};

    public static void main(String[] args)
    {
     //   sortMergedbyTreeSet(arr1,arr2);
        sortMergedbyLinkedHashSet(arr1,arr2);
    }

    static void sortMergedbyTreeSet(Integer[] arry1,Integer[] arry2)
    {
        Set<Integer> ts = new TreeSet<>();

        Collections.addAll(ts,arry1);
        Collections.addAll(ts,arry2);

        for(int i:ts)
        {
            System.out.println(i);
        }
    }

    static void sortMergedbyLinkedHashSet(Integer[] arry1,Integer[] arry2)
    {
        List<Integer> lst = new ArrayList<>();

        Collections.addAll(lst,arry1);
        Collections.addAll(lst,arry2);

        for(int i:lst)
        {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");
        Collections.sort(lst);
        System.out.println("------------------------------------------------");
        for(int i:lst)
        {
            System.out.println(i);
        }
    }
}
