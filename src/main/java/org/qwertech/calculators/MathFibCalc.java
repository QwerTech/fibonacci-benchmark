package org.qwertech.calculators;

import org.qwertech.FibCalc;

/**
 * Math pow and sqrt approximate Fibonacci Calculator.
 *
 * @see <a href="https://github.com/wadeking98/fibonacci-O-1-">sources</a>
 * @author wadeking98
 */
public class MathFibCalc implements FibCalc {
    @Override
    public long fib(int n) {
        double num = (1 / Math.sqrt(5)) * Math.pow(((1 + Math.sqrt(5)) / 2), n) -
                (1 / Math.sqrt(5)) * Math.pow(((1 - Math.sqrt(5)) / 2), n);
        return Math.round(num);
    }
}
