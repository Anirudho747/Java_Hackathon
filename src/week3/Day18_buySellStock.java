package week3;

public class Day18_buySellStock {

    static int[] arr = new int[]{7,1,5,3,6,4};
    static int flag=0,maxMargin=0;

    public static void main(String[] args)
    {
        getDiff();
    }

    static void getDiff()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                    if(maxMargin>(arr[i]-arr[j]))
                    {
                        flag++;
                        maxMargin = (arr[i]-arr[j]);
                    }
            }
        }

        if(flag>0)
        {
            System.out.println(Math.abs(maxMargin));
        }
        else
        {
            System.out.println("No Transaction");
        }

    }
}
