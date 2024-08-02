import java.util.Scanner;

public class Main1018 {
    private static final int[] BANK_NOTES = {100, 50, 20, 10, 5, 2, 1};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        input.close();
        System.out.println(value);

        for (int banknote : BANK_NOTES){
            int notes = value / banknote;
            value = value % banknote;
            System.out.printf("%d nota(s) de R$ %d,00\n", notes, banknote);
        }

    }
}
