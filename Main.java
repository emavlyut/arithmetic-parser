package expression;

import expression.generic.GenericTabulator;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new GenericTabulator().tabulate("l", "-    (2+2)", 0, 0, 0, 0, 0, 0)[0][0][0]);
    }
}
