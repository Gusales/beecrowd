import java.util.Locale;
import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double note1 = input.nextFloat() * 2;
        double note2 = input.nextFloat() * 3;
        double note3 = input.nextFloat() * 5;

        input.close();

        double media = (note1 + note2 + note3) / 2 + 3 + 5;

        System.out.printf("MEDIA = %.1f\n", media);
    }    
}
