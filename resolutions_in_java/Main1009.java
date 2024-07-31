import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String employeeName = input.nextLine();
        double salaryBasic = input.nextDouble();
        double salesTotal = input.nextDouble();
        input.close();

        double bonus = salesTotal * 0.15;

        double total = salaryBasic + bonus;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
