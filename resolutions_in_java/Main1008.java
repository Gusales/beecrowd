import java.util.Locale;
import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int employeeNumber = input.nextInt();
        int workedHours = input.nextInt();
        float salaryByHours = input.nextFloat();
        input.close();

        double total = workedHours * salaryByHours;
        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }
}
