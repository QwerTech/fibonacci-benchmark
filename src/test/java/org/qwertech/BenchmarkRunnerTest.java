package org.qwertech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * BenchmarkRunnerTest.
 *
 * @author Pavel_Novikov1
 */
public class BenchmarkRunnerTest {
    @Test
    public void benchmark() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        BenchmarkRunner.NHolder nh = new BenchmarkRunner.NHolder();
        nh.n = 0;
        BenchmarkRunner.ClassHolder classHolder = new BenchmarkRunner.ClassHolder();
        classHolder.calcClass = "RecursiveFibCalc";
        classHolder.setUp();
        assertEquals(new BenchmarkRunner().benchmark(nh, classHolder), 0);
    }
}