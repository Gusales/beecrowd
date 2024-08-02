import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int tripTimeInHours = input.nextInt();
        int speedInTrip = input.nextInt();

        int distanceTraveled = speedInTrip * tripTimeInHours;

        double liters = (double) distanceTraveled / 12;

        System.out.printf("%.3f\n", liters);
    }
}
