import java.util.Scanner;

public class JavaSubstringComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.next();
        System.out.print("Enter Substring Length: ");
        int k = sc.nextInt();
        String smallest = input.substring(0, k);
        String largest = input.substring(0, k);

        for (int i = 1; i <= input.length() - k; i++) {
            String substring = input.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        System.out.println("Smallest substring: " + smallest);
        System.out.println("Largest substring: " + largest);
    }
}
