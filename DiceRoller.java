public class DiceRoller {
    public static void main(String[] args) {
//        // Placeholder for user input handling
//        String userInput = "2d6 + 3"; // Example input
//        DiceExpression expression = new DiceExpression(userInput);
//        expression.evaluate();

        String input = "2d10 + 3d8 - 5";

        boolean isValidInput = DiceExpression.parseInput(input);

        if (!isValidInput) {
            System.out.println("Invalid input"); // TODO make a more descriptive error
            return;
        }

        Input parsedInput = new Input(new int[]{10, 10, 8, 8, 8}, DiceRoll.Operator.SUBTRACT, 5);
        int[] diceTypes = parsedInput.diceTypes;
        DiceRoll.Operator operator = parsedInput.operator;
        int number = parsedInput.number;



        int[] diceResults = DiceRoll.rollAllDice(diceTypes);
        int finalResult = DiceRoll.getFinalResult(diceResults, operator, number);
        String output = DiceRoll.compileOutput(diceResults, finalResult);
        System.out.println(output);
    }
}
