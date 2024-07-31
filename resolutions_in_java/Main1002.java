import java.util.Scanner;

public class Main1002{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double ray = input.nextDouble();
        input.close();
        double pi = 3.14159;
        
        double area = pi * (ray * ray);
        
        System.out.printf("A=%.4f\n", area);
    }
}