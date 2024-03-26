package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Day45_Anagram {

    static String a1 = "Abra ca dabra";
    static String a2 = "Dabra abra ca";

    public static void main(String[] args)
    {
        anagramByCollection();
    }

    static void anagramByCollection()
    {
        ArrayList<String> ts = new ArrayList<>();
        ArrayList<String> ts2 = new ArrayList<>();

        String[] arr1 = a1.toLowerCase().split("");
        String[] arr2 = a2.toLowerCase().split("");

        Collections.addAll(ts,arr1);
        Collections.addAll(ts2,arr2);

        Collections.sort(ts);
        Collections.sort(ts2);

        System.out.println(ts);
        System.out.println(ts2);

        System.out.println(ts.equals(ts2));
    }


}
