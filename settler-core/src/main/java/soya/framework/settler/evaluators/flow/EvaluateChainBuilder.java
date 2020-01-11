package soya.framework.settler.evaluators.flow;

import soya.framework.settler.*;
import soya.framework.settler.evaluators.AbstractEvaluatorBuilder;

@EvaluatorDef(name = "chain")
public class EvaluateChainBuilder extends AbstractEvaluatorBuilder<EvaluateChainBuilder.EvaluateChain> {

    @Override
    public EvaluateChain build(EvaluateTreeNode[] arguments, EvaluationContext context) throws EvaluatorBuildException {
        return null;
    }

    public static class EvaluateChain implements Evaluator {
        Evaluator[] evaluators;

        @Override
        public String evaluate(String data) throws EvaluateException {
            String result = data;
            for (int i = 0; i < evaluators.length; i ++) {
                result = evaluators[i].evaluate(result);
            }
            return result;
        }
    }
}
