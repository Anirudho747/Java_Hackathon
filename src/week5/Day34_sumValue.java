package week5;

public class Day34_sumValue {

    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target=9,flag=0;
        int[] nums2 = {2,3,4};
        int[] a1 = new int[2];
     //   int[] sol   = new int[2];
    //    sol = twoSum(nums,9);


        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if ((nums[i] + nums[j])==target)
                {
                    a1[0] = i;
                    a1[1] = j;
                    flag=1;
                    break;
                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }

    }


    static int[] twoSum(int[] nums, int target) {

        int flag=0;
        int[] a1 = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if (target == nums[i] + nums[j])
                {
                    a1[0] = i;
                    a1[1] = j;
                    flag=1;
                    break;
                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        for(int i=0;i<a1.length-1;i++)
        {
            System.out.println(a1[i]);
        }
           return a1;
    }
}
