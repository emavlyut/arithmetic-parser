package expression;

import expression.generic.GenericTabulator;
import expression.generic.executors.LongExecutor;
import expression.generic.parser.ExpressionParser;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
                new ExpressionParser<Long>().parse(new LongExecutor(), "((x - 32) + (y * z))")
                        .evaluate(10L, -10L, 43L)
        );
        System.out.println(new GenericTabulator().tabulate("l", "-    (2+2)", 0, 0, 0, 0, 0, 0)[0][0][0]);
    }
}
