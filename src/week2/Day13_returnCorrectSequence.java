package week2;

public class Day13_returnCorrectSequence {

    static String str="so8 too9 i6 love4 leetcode5 think7 and2 alice1 bob3";
  //  static String str="alice1 bob3 and2";
    public static void main(String[] args)
    {
        getSequence();
    }

    public static void getSequence()
    {
        String[] strArray = str.split(" ");
        int[] seq = new int[strArray.length];
        String[] onlyWords = new String[strArray.length];
        String[] res = new String[strArray.length];

        int j=0;
        for(int i=0;i< strArray.length;i++)
        {
            j = Integer.parseInt(strArray[i].substring(strArray[i].length()-1));
            res[j-1] = strArray[i].substring(0,strArray[i].length()-1);
        }

        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }

    }

}
