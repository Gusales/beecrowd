import java.util.*;

public class Main3053 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Map<String, Boolean> initialCups = Map.of(
      "A", false,
      "B", false,
      "C", false
    );

    Map<String, Boolean> cups = new HashMap<>(initialCups);

    int movements = input.nextInt();
    String coinPositionInitial = input.next().toUpperCase();
    cups.put(coinPositionInitial, true);

    for (int i = 0; i < movements; i++) {
      int movement = input.nextInt();

      boolean oldA, oldB, oldC;

      switch (movement) {
        case 1:
        oldA = cups.get("A");
        oldB = cups.get("B");
        cups.put("A", oldB);
        cups.put("B", oldA);
        /**
         * A => B
         * B => A
         */
          break;
        
        case 2:
        /**
         * B => C
         * C => B
         */
          oldC = cups.get("C");
          oldB = cups.get("B");
          cups.put("C", oldB);
          cups.put("B", oldC);
          break;
      
        default:
        /**
         * C => A
         * A => C
         */
          oldC = cups.get("C");
          oldA = cups.get("A");
          cups.put("C", oldA);
          cups.put("A", oldC);
          break;
      }

    }
    
    if (cups.get("A") == true) {
      System.out.println("A");
    }

    if (cups.get("B") == true) {
      System.out.println("B");
    }

    if (cups.get("C") == true) {
      System.out.println("C");
    }

    input.close();
  }
}
