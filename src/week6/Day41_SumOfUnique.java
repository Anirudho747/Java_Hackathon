package week6;


import java.util.Collections;
import java.util.TreeSet;

public class Day41_SumOfUnique {

    static int[] arry1 = new int[]{1, 2, 3, 2};

    public static void main(String[] args) {
        sumOfUnique(arry1);
    }

    static void sumOfUnique(int[] arr)
    {
        int cnt=1,flag=0,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]==arr[j]) || (arr[j]==-91823645))
                {
                    flag++;
                    arr[j] = -91823645;
                    break;
                }
            }
            if((flag==0) && (arr[i]!=-91823645)) sum = sum+arr[i];
            flag=0;
        }

        System.out.println(sum);
    }

    static void treeSetUsage(int[] arr) {
        Integer[] newArray = new Integer[arr.length];
        for(int i = 0; i<arr.length;i++)
        {
           newArray[i] = arr[i];
        }
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Collections.addAll(ts,newArray);
            Integer sum=0;
        for(Integer e:ts)
        {
            sum = sum+e;
        }
        System.out.println(sum);
}
}
