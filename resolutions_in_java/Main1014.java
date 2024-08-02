import java.util.*;

public class Main1014 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int distanceInKm = input.nextInt();
        float fuelTotal = input.nextFloat();

        double average = distanceInKm / fuelTotal;

        System.out.printf("%.3f km/l\n", average);
    }
}
