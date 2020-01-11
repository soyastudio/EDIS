package soya.framework.settler.evaluators.utils;

import soya.framework.settler.*;

@EvaluatorDef(name = "replace")
public class ReplaceBuilder implements EvaluatorBuilder<ReplaceBuilder.Replace> {
    @Override
    public Replace build(EvaluateTreeNode[] arguments, EvaluationContext context) throws EvaluatorBuildException {
        Replace replace = new Replace();
        // TODO
        return replace;
    }

    static class Replace implements Evaluator {
        private Replace() {
        }

        @Override
        public String evaluate(String data) throws EvaluateException {
            return null;
        }
    }
}
