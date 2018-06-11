package org.qwertech;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.qwertech.calculators.MathFibCalc;
import org.qwertech.calculators.RecursiveFibCalc;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Fibonacci Calculation Test.
 *
 * @author Pavel_Novikov1
 */
@RunWith(Parameterized.class)
public class FibCalcTest {

    private static final Map<Object, Object> DEFAULT_VALUES = ImmutableMap.builder()
            .put(0, 0)
            .put(1, 1)
            .put(2, 1)
            .put(3, 2)
            .put(4, 3)
            .put(5, 5)
            .put(6, 8)
            .put(40, 102334155)
            .put(50, 12586269025L)
            .put(60, 1548008755920L)
            .put(70, 190392490709135L)
            .put(71, 308061521170129L)
            .put(72, 498454011879264L)
            .put(80, 23416728348467685L)
            .put(92, 7540113804746346429L) // maximum number that can be placed in long
            .build();
    private static final Object[][] PREDEFINED_TESTS = new Object[][]{
            {RecursiveFibCalc.class, 0, 0},
            {RecursiveFibCalc.class, 1, 1},
            {RecursiveFibCalc.class, 2, 1},
            {RecursiveFibCalc.class, 3, 2},
            {RecursiveFibCalc.class, 4, 3},
            {RecursiveFibCalc.class, 5, 5},
            {RecursiveFibCalc.class, 6, 8},
            {RecursiveFibCalc.class, 20, 6765}, // next require too much time
            {MathFibCalc.class, 0, 0},
            {MathFibCalc.class, 1, 1},
            {MathFibCalc.class, 2, 1},
            {MathFibCalc.class, 3, 2},
            {MathFibCalc.class, 4, 3},
            {MathFibCalc.class, 5, 5},
            {MathFibCalc.class, 6, 8},
            {MathFibCalc.class, 40, 102334155},
            {MathFibCalc.class, 50, 12586269025L},
            {MathFibCalc.class, 60, 1548008755920L},
            {MathFibCalc.class, 70, 190392490709135L},// maximum right
//                {MathFibCalc.class, 71, 308061521170129L}, // but results 308061521170130
//                {MathFibCalc.class, 72, 498454011879264L}, // but results 498454011879265
//                {MathFibCalc.class, 80, 23416728348467685L}, // but results 23416728348467744
//                {MathFibCalc.class, 92, 7540113804746346429L}, // but results 7540113804746369024
    };
    private final FibCalc fibCalc;
    private int n;
    private long expected;

    public FibCalcTest(Class<FibCalc> calcClass, int n, long expected) throws IllegalAccessException, InstantiationException {
        this.n = n;
        this.expected = expected;
        fibCalc = calcClass.newInstance();
    }

    @Parameterized.Parameters(name = "{index}: class={0}; n={1}; exp={2}")
    public static List<Object[]> params() {

        //find all calculators
        Set<Class<? extends FibCalc>> fibCalcs = new Reflections("org.qwertech.calculators")
                .getSubTypesOf(FibCalc.class);

        List<Object[]> result = new ArrayList<>(asList(PREDEFINED_TESTS));
        //remove predefined classes
        fibCalcs.removeAll(result.stream().map(c -> (Class) c[0]).collect(Collectors.toList()));
        //union predefined with default classes
        fibCalcs.forEach(c -> DEFAULT_VALUES.forEach((n, v) -> result.add(new Object[]{c, n, v})));
        return result;
    }

    @Test
    public void calcFib() {
        assertEquals(this.expected, fibCalc.fib(this.n));
    }
}