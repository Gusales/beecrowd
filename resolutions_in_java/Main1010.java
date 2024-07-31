import java.util.Locale;
import java.util.Scanner;

public class Main1010 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double total = 0;
        for (int i = 0; i <= 1; i++){
            int productCode = input.nextInt();
            int productQntd = input.nextInt();
            float productPrice = input.nextFloat();

            total += productQntd * productPrice;
        }

        input.close();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
