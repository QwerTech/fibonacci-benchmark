package org.qwertech;

public class CycleFibCalc implements FibCalc {

    public long fib(int index) {
        long prev = 1;
        long prePrev = 0;
        if (index == 0) return prePrev;
        if (index == 1) return prev;
        long curr = 0;
        for (int i = 1; i < index; i++) {
            curr = prev + prePrev;
            prePrev = prev;
            prev = curr;
        }
        return curr;
    }
}
