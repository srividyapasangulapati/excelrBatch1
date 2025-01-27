import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerYear = 365; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        int minutesPerDay = minutesPerHour * hoursPerDay;
        int minutesPerYear = minutesPerDay * daysPerYear;
        long totalMinutes = (long) years * minutesPerYear;
        int totalDays = years * daysPerYear;
        System.out.println(years + " years is approximately:");
        System.out.println(" - " + totalMinutes + " minutes");
        System.out.println(" - " + totalDays + " days");
    }
}
