package expression.operations;

@FunctionalInterface
public interface TripleExpression extends ToMiniString {
    int evaluate(int x, int y, int z);
}
