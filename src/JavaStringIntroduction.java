import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aLength=A.length();
        int bLength=B.length();
        int sum=aLength+bLength;

        System.out.println(sum);

        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println((A.substring(0,1)).toUpperCase()+A.substring(1,aLength)+" "+(B.substring(0,1)).toUpperCase()+B.substring(1,bLength));

    }
}
