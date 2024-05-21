import java.util.Locale;
import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double note1 = input.nextFloat() * 3.5;
        double note2 = input.nextFloat() * 7.5;
        input.close();

        double media = (note1 + note2) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f", media);
    }    
}
