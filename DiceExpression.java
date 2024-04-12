import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiceExpression {
    private String expression;

    public DiceExpression(String expression) {
        this.expression = expression.trim(); // Trim the input string
    }

    public void evaluate() {
    }

    public Input parseInput(String input) {
        Pattern pattern = Pattern.compile("^\\d.\\d\\+?");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if(matcher.matches())
        {
            Input operator=matcher
        }
        System.out.println("Valid input " + matchFound);
        matcher.group(0);

        return new Input(diceTypes, operator, number);
    }
}
