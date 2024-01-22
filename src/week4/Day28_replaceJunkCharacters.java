package week4;

public class Day28_replaceJunkCharacters {

    public static void main(String[] args)
    {
        String s="qwe!123@ASD&zxc*> dfdsfds%&&*(*SDGFD";

        s=s.replaceAll("[^A-Za-z0-9]","");
        System.out.println(s);
    }
}
