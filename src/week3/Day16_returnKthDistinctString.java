package week3;

public class Day16_returnKthDistinctString {

    static String[] str1=new String[]{"abc","d","e","f","defg","abc","d","k","defg"};
    static int k=3;
    public static void main(String[] args)
    {
        findDistinct(str1,k);
    }

    static void findDistinct(String[] a,int f)
    {
        int cnt=0,unique=1;
        for(int i=0;i<a.length;i++)
        {
            unique=1;
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i].equalsIgnoreCase(a[j])) && (a[j]!="(!@#$%^&*)"))
                {
                    unique=0;
                    a[j]="(!@#$%^&*)";
                    break;
                }
            }

            if((unique==1) && (a[i]!="(!@#$%^&*)"))
            {
                cnt++;
                if(cnt==f)
                {
                    System.out.println(a[i]+" is "+f+" number unique element");
                }
            }
        }

    }
}
