package week6;

public class Day36_Square_Each_Element {

    public static void main(String[] args)
    {
        int[] nums1 = {-4,-1,0,3,10};
        int[] answer=sortedSquare(nums1);

        System.out.println();
        for(int i=0;i<=answer.length-1;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }

    static int[] sortedSquare(int[] nums)
    {
        int[] sqr = new int[nums.length];
        int temp=0;

        for(int i=0;i<=nums.length-1;i++)
        {
            sqr[i] = nums[i]*nums[i];
            System.out.print(sqr[i]);
        }

        for(int i=0;i<=sqr.length-1;i++)
        {
            for(int j=i+1;j<=sqr.length-1;j++)
            {
                if(sqr[i]>sqr[j])
                {
                    temp = sqr[i];
                    sqr[i] = sqr [j];
                    sqr[j] = temp;
                }
            }
        }

        return sqr;
    }
}
