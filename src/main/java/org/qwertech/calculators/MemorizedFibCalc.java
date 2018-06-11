package org.qwertech.calculators;

import org.qwertech.FibCalc;

/**
 * Matrices Fibonacci Calculation.
 *
 * @author Pavel_Novikov1
 */
public class MemorizedFibCalc implements FibCalc {

    private long[] fibs; // array for memoized fibonacci numbers

    @Override
    public long fib(int n) {
        if (n < 2) {
            return n;
        }

        if (fibs == null) { // initialise array to first size asked for
            fibs = new long[n + 1];
        } else if (fibs.length < n) { // expand array
            long[] newfibs = new long[n + 1]; // inefficient if looping through values of n
            System.arraycopy(fibs, 0, newfibs, 0, fibs.length);
            fibs = newfibs;
        }

        if (fibs[n] == 0) {
            fibs[n] = fib(n - 1) + fib(n - 2);
        }

        return fibs[n];
    }
}
