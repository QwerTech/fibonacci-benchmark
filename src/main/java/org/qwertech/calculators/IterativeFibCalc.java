package org.qwertech.calculators;

import org.qwertech.FibCalc;

/**
 * O(n) time, O(1) memory
 */
public class IterativeFibCalc implements FibCalc {
    public long fib(int n) {
        long prev = 1;
        long prePrev = 0;
        long curr = n;
        for (int i = 1; i < n; i++) {
            curr = prev + prePrev;
            prePrev = prev;
            prev = curr;
        }
        return curr;
    }
}
