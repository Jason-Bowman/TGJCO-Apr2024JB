
public class Input {

    public Input(int[] diceTypes, DiceRoll.Operator operator, int number) {
        this.diceTypes = diceTypes;
        this.operator = operator;
        this.number = number;
    }

    int[] diceTypes;
    DiceRoll.Operator operator;
    int number;
}
