package TreeElements;

/**
 * Created by usuario on 21/09/2015.
 */
public class Constant extends Expression{

    private int value;

    public Constant(int value){

        this.value = value;
    }

    @Override
    public int value(){
        return value;
    }
}
