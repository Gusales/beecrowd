import java.util.*;

public class Main1168 {
  public static void main(String[] args) {
    Map<String, Integer> leds = Map.of(
        "0", 6,
        "1", 2,
        "2", 5,
        "3", 5,
        "4", 4,
        "5", 5,
        "6", 6,
        "7", 3,
        "8", 7,
        "9", 6
    );
    Scanner input = new Scanner(System.in);

    int testCase = input.nextInt();

    int count = 0;
    String writedNumber;
    int quantidadesLeds = 0;

    while (count < testCase) {
      writedNumber = input.next();
      String[] splitedNumber = writedNumber.split("");

      for (String num : splitedNumber) {
        quantidadesLeds += leds.get(num);
      }
      System.out.printf("%s leds\n", quantidadesLeds);
      count++;
      quantidadesLeds = 0;
    }

    input.close();
  }
}
