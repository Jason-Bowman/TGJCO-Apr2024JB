
public class DiceRoller {
    public static void main(String[] args) {
//        // Placeholder for user input handling
//        String userInput = "2d6 + 3"; // Example input
//        DiceExpression expression = new DiceExpression(userInput);
//        expression.evaluate();

        String input = "2d10 + 3d8 - 5";

        DiceExpression.parseInput(input);
        int[] diceResults = DiceRoll.rollAllDice(diceTypes)
        String output = DiceRoll.compileOutput(diceResults, finalResult);


    }
}
