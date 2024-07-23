/*
The challenge here is to read n lines of input until you reach EOF, then number

and print all n lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown n lines of input from stdin(System.in) until you reach EOF;

each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the

line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
 */

import java.util.*;
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;

        while(sc.hasNext())
        {
            System.out.println(++n +" "+sc.nextLine());
            // these lines are used to limit the input not required while solving problem in HackerRank
//            if(n>3)
//                return ;

        }

    }

}
/*
fieojohv ierhvv ihrhe0
1 fieojohv ierhvv ihrhe0
uhreighv0 oiho0re
2 uhreighv0 oiho0re
porje-jv-re pojerhj- iohor
3 porje-jv-re pojerhj- iohor
hr9e09h0re9 09erh09hre
4 hr9e09h0re9 09erh09hre

 */
