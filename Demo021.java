import java.util.Scanner;
public class Demo021 {
public class TaxOnIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly gross salary: Rs ");
        double monthlyGrossSalary = scanner.nextDouble();
        System.out.print("Enter monthly HRA: Rs ");
        double monthlyHRA = scanner.nextDouble();
        System.out.print("Enter monthly PF: Rs ");
        double monthlyPF = scanner.nextDouble();
        double annualSalary = monthlyGrossSalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;
        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;
        double tax;
        if (taxableIncome <= 500000) {
            tax = 0.1 * taxableIncome;
        } else if (taxableIncome <= 1000000) {
            tax = 0.1 * 500000 + 0.2 * (taxableIncome - 500000);
        } else {
            tax = 0.1 * 500000 + 0.2 * 500000 + 0.3 * (taxableIncome - 1000000);
        }
        System.out.println("\n--- Income Tax Calculation ---");
        System.out.printf("Annual Gross Salary: Rs %.2f\n", annualSalary);
        System.out.printf("Total Deductions (HRA + PF): Rs %.2f\n", deductions);
        System.out.printf("Taxable Income: Rs %.2f\n", taxableIncome);
        System.out.printf("Annual Income Tax: Rs %.2f\n", tax);
        scanner.close();
    }
}

}
