package expression.exceptions;

import expression.operations.Abs;
import expression.operations.CommonExp;

public class CheckedAbs extends Abs {
    public CheckedAbs(CommonExp expression) {
        super(expression);
    }

    @Override
    public int makeOp(int x) {
        if (x == Integer.MIN_VALUE) {
            throw overflow(x);
        }
        return super.makeOp(x);
    }
}
