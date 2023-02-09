package expression.operations;

public class Multiply extends AbstractBinaryOperation {
    public Multiply(CommonExp expression1, CommonExp expression2) {
        super(expression1, expression2);
    }

    @Override
    public int makeOp(int x, int y) {
        return x * y;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public int getPriority() {
        return 507;
    }
}
