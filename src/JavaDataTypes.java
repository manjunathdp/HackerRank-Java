/*
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and

double. For this exercise, we'll work with the primitives used to hold integer

values (byte, short, int, and long):

· A byte is an 8-bit signed integer.

· A short is a 16-bit signed integer.

. An int is a 32-bit signed integer.

· A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are

capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference:

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be
arbitrarily large or small.
 */

import java.util.*;
public class JavaDataTypes {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768  && x<=32767 )System.out.println("* short");

                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808l && x<=9223372036854775807l)System.out.println("* long");


                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
/*
output
5
-150
-150 can be fitted in:
* short
* int
* long
150000
150000 can be fitted in:
* int
* long
1500000000
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333333333333333333
213333333333333333333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000
-100000000000000 can be fitted in:
* long
 */
