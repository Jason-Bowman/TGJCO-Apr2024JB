import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiceExpression {
    private String expression;

    public DiceExpression(String expression) {
        this.expression = expression.trim(); // Trim the input string
    }

    public void evaluate() {
    }



    public static Input parseInput(String input) {
    String regexForOneTypeOfDie = "^((\\d*)d(\\d*))(\\s?)(([+\\-*])?(\\s(\\d+)))?";

       // String input= "2d6+3";
        String no_ofDice="_";
        String diceTypes="_";
        String operator="_";
        String mathsNumber = "_";
        Pattern pattern = Pattern.compile(regexForOneTypeOfDie);
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if(matcher.matches())
        {
            no_ofDice=matcher.group(2);
            diceTypes=matcher.group(3);
            operator=matcher.group(6);
            mathsNumber = matcher.group(8);

        }
        
        matcher.group(0);

        int[] allDice = new int[Integer.parseInt(no_ofDice)];

        for (int i = 0; i < Integer.parseInt(no_ofDice); i++) {
            allDice[i]=Integer.parseInt(diceTypes);
        }

        DiceRoll.Operator translatedOperator = DiceRoll.Operator.fromString(operator);

        return new Input(allDice, translatedOperator, Integer.parseInt(mathsNumber));
    }
}
