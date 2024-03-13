package week6;

public class Day39_SecondSmallestNumber_2 {

    static int[] arr = {7,5,11,2,0,14};

    public static void main(String[] args)
    {
        secondSmallest(arr);
    }

    static void secondSmallest(int[] arry)
    {
        int tmp=0;

        for(int i=0;i<arry.length;i++)
        {
            for(int j=i+1;j<arry.length;j++)
            {
                if(arry[i]>arr[j])
                {
                    tmp=arry[i];
                    arry[i] = arry[j];
                    arry[j] = tmp;
                }
            }
        }
        System.out.println(arry[1]);

    }
}
