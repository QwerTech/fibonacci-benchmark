package org.qwertech.calculators;

import org.qwertech.FibCalc;

public class RecursiveFibCalc implements FibCalc {
    @Override
    public long fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
