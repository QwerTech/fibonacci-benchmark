package org.qwertech.calculators;

import org.junit.Test;

/**
 * MemorizedFibCalcTest.
 *
 * @author Pavel_Novikov1
 */
public class MemorizedFibCalcTest {

    @Test
    public void fib() {
        MemorizedFibCalc calc = new MemorizedFibCalc();
        calc.fib(3);
        calc.fib(15);
    }
}