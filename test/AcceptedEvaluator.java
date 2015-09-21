import TreeElements.Addition;
import TreeElements.Constant;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by usuario on 21/09/2015.
 */

public class AcceptedEvaluator {

    @Test
    public void should_evaluate_constant_expression() throws Exception{
        Evaluator evaluator = new Evaluator();
        assertEquals(4, evaluator.evaluate(new Expression(4)));
        assertEquals(5, evaluator.evaluate(new Expression(5)));
        assertEquals(-1, evaluator.evaluate(new Expression(-1)));
    }


    @Test
    public void should_evaluate_adding_expression() throws Exception {
        Evaluator evaluator = new Evaluator();
        assertEquals(7, evaluator.evaluate(new Addition(new Constant(4), new Constant(3))));

    }
}
