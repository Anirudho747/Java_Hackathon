package week5;

public class Day33_reaarangeSentence {

    public static void main(String[] args)
    {
        String str1 = "is2 sentence4 This1 a3";
        String str2 = "Myself2 Me1 I4 and3";

        sortSentence(str2);
    }

    public static String sortSentence(String s)
    {
        String[] sArray = s.split(" ");
        int[] seq = new int[sArray.length];
        String[] wrd = new String[sArray.length];

         for(int i=0;i<sArray.length;i++)
         {
            seq[i] = returnLastDigit(sArray[i]);
            wrd[i] = returnString(sArray[i]);
         }

         for(int j=1;j<=seq.length;j++)
         {
              for(int k=0;k<seq.length;k++)
             {
                 if(j==seq[k])
                 {
                     System.out.print(wrd[k]+" ");
                 }
             }
         }
        return "Hi";
    }

    static int returnLastDigit(String s1)
    {
        return Character.getNumericValue(s1.charAt(s1.length()-1));
    }

    static String returnString(String s1)
    {
        return s1.substring(0,s1.length()-1);
    }
}
