import java.util.*;

public class Main1041 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    float x = input.nextFloat();
    float y = input.nextFloat();

    input.close();

    String quadrante = "Q1";

    if (x == 0 && y == 0) {
      quadrante = "Origem";
    }

    if (x > 0 && y < 0) {
      quadrante = "Q4";
    }

    if (x < 0 && y > 0) {
      quadrante = "Q2";
    }

    if (x < 0 && y < 0) {
      quadrante = "Q3";
    }

    System.out.println(quadrante);
  }
}