package week2;

public class Day13_returnifSameString {

    static String[] str1=new String[]{"abc","d","defg"};
    static String[] str2={"abccdefg"};
    public static void main(String[] args)
    {
        compare(str1,str2);
    }

    static String concat(String[] a)
    {
        String d = "";
        for(int i=0;i<a.length;i++)
        {
            d = d+a[i];
        }
        return d;
    }

    static void compare(String[] a,String[] b)
    {
        if(concat(a).equalsIgnoreCase(concat(b)))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("false");
        }
    }


}
