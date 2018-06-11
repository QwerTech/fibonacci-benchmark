package org.qwertech.calculators;

import org.qwertech.FibCalc;

/**
 * Matrices Fibonacci Calculation.
 *
 * @author Pavel_Novikov1
 */
public class MatricesFibCalc implements FibCalc {
    @Override
    public long fib(int n) {
        long a = 1;
        long b = 1;
        long c = 1;
        long rc = 0;
        long d = 0;
        long rd = 1;

        while (n > 0) {
            long tc;
            if (n % 2 == 1)
            {
                tc = rc;
                rc = rc * a + rd * c;
                rd = tc * b + rd * d;
            }

            long ta = a;
            long tb = b;
            tc = c;
            a = a * a + b * c;
            b = ta * b + b * d;
            c = c * ta + d * c;
            d = tc * tb + d * d;

            n >>= 1;

        }
        return rc;
    }
}
