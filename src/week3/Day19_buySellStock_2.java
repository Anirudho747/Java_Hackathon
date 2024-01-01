package week3;

public class Day19_buySellStock_2 {

    static int[] arr = new int[]{7,6,4,3,1};
    static int min,difference=0;
    public static void main(String[] args)
    {
        findMaxSum();
    }

    static void findMaxSum()
    {
        min = arr[0];
        for(int i=1; i<arr.length;i++)
        {
             if((arr[i]-min)>difference)
             {
                 difference = arr[i]-min;
             }
             min=Math.min(min,arr[i]);
        }

        System.out.println(difference);
    }
}
