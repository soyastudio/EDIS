package soya.framework.settler.evaluators.utils;

import soya.framework.settler.*;

@EvaluatorDef(name = "random_number")
public class RandomNumberBuilder implements EvaluatorBuilder<RandomNumberBuilder.RandomNumber> {
    @Override
    public RandomNumber build(EvaluateTreeNode[] arguments, EvaluationContext context) throws EvaluatorBuildException {
        RandomNumber randomNumber = new RandomNumber();
        // TODO:
        return randomNumber;
    }

    static class RandomNumber implements Evaluator {

        private RandomNumber() {
        }

        @Override
        public String evaluate(String data) throws EvaluateException {
            return null;
        }
    }
}
