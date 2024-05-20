import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        
        int sum = num1 + num2;
        
        System.out.printf("SOMA = %s\n", sum);
    }    
}
