import java.util.Arrays;
import java.lang.Math;

public class DiceRoll {

    // Static method to roll a die with a specified number of sides
    public static int roll(int sides) {
        // Implement dice rolling logic
        int result=0;
        int min=1;
        int range=sides-min+1;

        result=(int)(Math.random()*range)+min;

        return result;
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

    public static int getFinalResult(int[] diceResults, Operator operator, int number) {
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

    public static String compileOutput(int[] diceResults, int finalResult) {
        // example: Rolls: 4, 4, 7, 1 Result: 16
        StringBuilder response = new StringBuilder();
        response.append("Rolls: ");
        for (int i = 0; i < diceResults.length; i++) {
            response.append(diceResults[i]);
            if (i != diceResults.length - 1) {
                response.append(", ");
            }
        }
        response.append(" Final score: ");
        response.append(finalResult);
        return response.toString();
    }




}
