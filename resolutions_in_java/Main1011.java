import java.util.*;

public class Main1011 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        float radius = input.nextFloat();
        double pi = 3.14159;
        input.close();
        double volume = ((double) 4 /3) * Math.pow(radius, 3) * pi;
        System.out.printf("VOLUME = %.3f", volume);
    }
}
