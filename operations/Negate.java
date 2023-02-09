package expression.operations;

public class Negate extends AbstractUnaryOperation {
    public Negate(CommonExp expression) {
        super(expression);
    }

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public int makeOp(int x) {
        return -x;
    }
}
