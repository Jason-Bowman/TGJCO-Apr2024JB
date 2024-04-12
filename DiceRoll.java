import java.util.Arrays;
import java.util.List;

public class DiceRoll {

    // Static method to roll a die with a specified number of sides
    public static int roll(int sides) {
        // Implement dice rolling logic
    }

    public static int[] rollAllDice(int[] diceTypes) {
        // input [10, 10, 8, 8, 8]
        // Then iterate through array and roll(num)
        int numberOfDice = diceTypes.length;
        int [] results = new int[numberOfDice];
        for (int i = 0; i < numberOfDice; i++) {
            int answer = roll(diceTypes[i]);
            results[i] = answer;
        }
        return results;
    }

    public static enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY
    }

    public static int executeMaths(int[] diceResults, Operator operator, int number) {
        int totalOfDice = Arrays.stream(diceResults).sum();
        switch (operator) {
            case ADD -> {
                return totalOfDice + number;
            }
            case SUBTRACT -> {
                return totalOfDice - number;
            }
            case MULTIPLY -> {
                return totalOfDice * number;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
    


}
