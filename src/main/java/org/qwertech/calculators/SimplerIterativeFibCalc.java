package org.qwertech.calculators;

import org.qwertech.FibCalc;

/**
 * O(n) time, O(1) memory
 */
public class SimplerIterativeFibCalc implements FibCalc {
    @Override
    public long fib(int n) {
        long lo = 0;
        long hi = 1;
        for (int i = 0; i < n; i++) {
            hi = lo + hi;
            lo = hi - lo;
        }
        return lo;
    }
}
