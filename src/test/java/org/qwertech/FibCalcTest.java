package org.qwertech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * RecursiveFibCalcTest.
 *
 * @author Pavel_Novikov1
 */
@RunWith(Parameterized.class)
public class FibCalcTest {

    private final FibCalc fibCalc;
    private int index;
    private long expected;

    public FibCalcTest(Class<FibCalc> calcClass, int index, long expected) throws IllegalAccessException, InstantiationException {
        this.index = index;
        this.expected = expected;
        fibCalc = calcClass.newInstance();
    }

    @Parameterized.Parameters(name = "{index}: class={0}; idx={1}; exp={2}")
    public static Object[][] params() {
        return new Object[][]{
                {RecursiveFibCalc.class, 0, 0},
                {RecursiveFibCalc.class, 1, 1},
                {RecursiveFibCalc.class, 2, 1},
                {RecursiveFibCalc.class, 3, 2},
                {RecursiveFibCalc.class, 4, 3},
                {RecursiveFibCalc.class, 5, 5},
                {RecursiveFibCalc.class, 6, 8},
                {RecursiveFibCalc.class, 20, 6765},
                {CycleFibCalc.class, 0, 0},
                {CycleFibCalc.class, 1, 1},
                {CycleFibCalc.class, 2, 1},
                {CycleFibCalc.class, 3, 2},
                {CycleFibCalc.class, 4, 3},
                {CycleFibCalc.class, 5, 5},
                {CycleFibCalc.class, 6, 8},
                {CycleFibCalc.class, 40, 102334155},
                {CycleFibCalc.class, 92, 7540113804746346429L},
        };
    }

    @Test
    public void calcFib() {
        assertEquals(this.expected, fibCalc.fib(this.index));
    }
}