import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateTime {
    public static String findDay(int month, int day, int year) {
        LocalDate ld=LocalDate.of(year, month, day);
        return ld.getDayOfWeek().toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(findDay(month,day,year));
    }
}
