package TreeElements;

/**
 * Created by usuario on 21/09/2015.
 */
public class Expression {
    private char operator;
    private int value;
    private Expression left;
    private Expression right;

    public Expression(int value) {
        this.value = value;
    }

    public double evaluate(){
        switch (operator){
            case '+':
                return left.evaluate() + right.evaluate();
            case '*' :
                return left.evaluate() + right.evaluate();

            case '#': return value;
        }
        return 0;
    }

    public int value(){
        return value;
    }
}
