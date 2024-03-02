package week6;

public class Day37_ConcatenateSameArray {

    public static void main(String[] args)
    {
        int[] nums1 = {1,3,2,1};
        int[] answer=concatenate(nums1);

        System.out.println();
        for(int i=0;i<=answer.length-1;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }

    static int[] concatenate(int[] nums)
    {
        int[] narray = new int[nums.length*2];
        int i=0, j=0;
        while(i<narray.length)
        {
            for(j=0;j<=nums.length-1;j++)
            {
                narray[i] = nums[j];
                i++;
            }
            if(i==nums.length-1)
            {
                j=0;
            }
        }

        return narray;
    }
}
