import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maiorABC);
    }
}
