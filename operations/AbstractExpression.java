package expression.operations;

public abstract class AbstractExpression implements CommonExp {
    /**
     * <h2>getPriority()</h2>
     * <table border="3">
     *     <tr><td>Left priority |</td><td>Right priority |</td><td>Operations</td></tr>
     *     <tr><td>inf</td><td>10000</td><td>VarConst</td></tr>
     *     <tr><td>9</td><td>900..999</td><td>abs l0 t0 -</td></tr>
     *     <tr><td>7</td><td>700..799</td><td>** //</td></tr>
     *     <tr><td>5</td><td>500..599</td><td>/ *</td></tr>
     *     <tr><td>3</td><td>300..399</td><td>+ -</td></tr>
     *     <tr><td>1</td><td>100..199</td><td>>> << >>></td></tr>
     * </table>
     */
    private final StringBuilder toStr = new StringBuilder();
    private final StringBuilder toMiniStr = new StringBuilder();

    @Override
    public String toString() {
        if (toStr.isEmpty()) {
            toString(toStr);
        }
        return toStr.toString();
    }

    @Override
    public String toMiniString() {
        if (toMiniStr.isEmpty()) {
            toMiniString(toMiniStr);
        }
        return toMiniStr.toString();
    }
}
