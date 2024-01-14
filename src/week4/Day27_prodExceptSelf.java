package week4;

public class Day27_prodExceptSelf {

    static int[] arr = new int[]{ -1, -1, 0,-3 ,3};



    public static void main(String[] args) {
        int[] mainarray = prodAll();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(mainarray[i]);
        }

    }

    static int[] prodAll() {
        int prod;
        int[] product = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            prod=1;
            for(int j=0;j< arr.length;j++)
            {
                if (j != i) {
                    prod = prod * arr[j];
                }
            }
            product[i] = prod;
        }
        return product;
    }

    }
