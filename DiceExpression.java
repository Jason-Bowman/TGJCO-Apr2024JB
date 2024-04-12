import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiceExpression {
    private String expression;

    public DiceExpression(String expression) {
        this.expression = expression.trim(); // Trim the input string
    }

    public void evaluate() {
    }

    // Suggested output from parseInput
//    {
//        sides: [1,4,6,7],
//        operator: MINUS,
//        number: 5
//    }

    public int[] parseInput(String input) {
        Pattern pattern = Pattern.compile("^\\d.\\d\\+?");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        System.out.println("Valid input " + matchFound);
        matcher.group(0);
    }
}
