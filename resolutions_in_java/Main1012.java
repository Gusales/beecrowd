import java.util.*;

public class Main1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        input.close();

        System.out.printf("TRIANGULO: %.3f\n", calculateAreaTriangle(a, c));
        System.out.printf("CIRCULO: %.3f\n", calculateAreaCircule(c));
        System.out.printf("TRAPEZIO: %.3f\n", calculateAreaTrapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f\n", calculateAreaSquare(b));
        System.out.printf("RETANGULO: %.3f\n", calculateAreaRectangle(a, b));
    }

    private static double calculateAreaTriangle(float base, float height){
        return (base * height) / 2;
    }

    private static double calculateAreaCircule(float radius){
        double pi = 3.14159;
        return pi * Math.pow(radius, 2);
    }

    private static double calculateAreaTrapezio(float majorBase, float minorBase, float height){
        return ((majorBase + minorBase) * height) / 2;
    }

    private static double calculateAreaSquare(float side){
        return side * side;
    }

    private static double calculateAreaRectangle(float base, float height){
        return base * height;
    }

}
