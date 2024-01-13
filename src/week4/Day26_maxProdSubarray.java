package week4;

public class Day26_maxProdSubarray {

    static int arr[] = new int[]{2, 3, 2, 3, -2, 2, 8, 4};


    public static void main(String[] args) {
        System.out.println(maxProd());
    }

    static int maxProd() {
        int maxProd = 0;

        if (arr.length == 1)
        {
            maxProd = arr[0];
        }
        else
        {
            int prod = 1;
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]==0) { break;}
                else
                {
                    prod = prod*arr[i];
                    maxProd = Math.max(maxProd,prod);
                }
            }

            prod=1;
            for (int i = arr.length-1; i >=0; i--)
            {
                if(arr[i]==0) { break;}
                else
                {
                    prod = prod*arr[i];
                    maxProd = Math.max(maxProd,prod);
                }
            }
        }
        return maxProd;
    }
}