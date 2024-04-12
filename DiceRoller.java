public class DiceRoller {
    public static void main(String[] args) {
//        // Placeholder for user input handling
//        String userInput = "2d6 + 3"; // Example input
//        DiceExpression expression = new DiceExpression(userInput);
//        expression.evaluate();

        String input = "2d10 - 5";

        Input parsedInput = DiceExpression.parseInput(input);
        int[] diceTypes = parsedInput.diceTypes;
        DiceRoll.Operator operator = parsedInput.operator;
        int number = parsedInput.number;


        int[] diceResults = DiceRoll.rollAllDice(diceTypes);
        int finalResult = DiceRoll.getFinalResult(diceResults, operator, number);
        String output = DiceRoll.compileOutput(diceResults, finalResult);
        System.out.println(output);
    }
}
