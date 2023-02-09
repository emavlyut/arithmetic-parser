package expression.operations;

public interface Operation extends CommonExp {
    String getOperator();
    /**
     * getPriority()
     *    10000    VarConst
     *  9 900..999 abs l0 t0 -
     *  7 700..799 ** //
     *  5 500..599 / *
     *  3 300..399 + -
     *  1 100..199 >> << >>>
     */
    int getPriority();
}
