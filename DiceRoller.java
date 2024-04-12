public class DiceRoller {
    public static void main(String[] args) {
//        // Placeholder for user input handling
//        String userInput = "2d6 + 3"; // Example input
//        DiceExpression expression = new DiceExpression(userInput);
//        expression.evaluate();

        String input = "2d10 + 3d8 - 5";
        int[] diceTypes = new int[]{10, 10, 8, 8, 8};
        DiceRoll.Operator operator = DiceRoll.Operator.SUBTRACT;
        int number = 5;

        boolean isValidInput = DiceExpression.parseInput(input);


        int[] diceResults = DiceRoll.rollAllDice(diceTypes);
        int finalResult = DiceRoll.getFinalResult(diceResults, operator, number);
        String output = DiceRoll.compileOutput(diceResults, finalResult);
        System.out.println(output);
    }
}
