/*
Objective

In this challenge, we're going to use loops to help us do some simple math.

Task

Given an integer, N, print its first 10 multiples. Each multiple N x i (where
1 ≤ i ≤ 10) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, N.

Constraints

.2≤N ≤20

Output Format

Print 10 lines of output; each line i (where 1 ≤ i ≤ 10) contains the result of
N x i in the form:

N x i = result.
 */


import java.io.*;

public class JavaLoop1 {
    public static void printTables(int N)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+ i+" = "+(i*N));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        printTables(N);

        bufferedReader.close();
    }


}
/*
OUTPUT
17
17 x 1 = 17
17 x 2 = 34
17 x 3 = 51
17 x 4 = 68
17 x 5 = 85
17 x 6 = 102
17 x 7 = 119
17 x 8 = 136
17 x 9 = 153
17 x 10 = 170

 */
