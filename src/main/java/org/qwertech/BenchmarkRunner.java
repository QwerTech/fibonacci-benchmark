package org.qwertech;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * Benchmark calculation of fibonacci series with different algorithms.
 *
 * @author Pavel_Novikov1
 */
public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
//    @Fork(warmups = 1, value = 1)
//    @Warmup(iterations = 1)
//    @Measurement(iterations = 1)
//    @BenchmarkMode(Mode.Throughput)
//    @OperationsPerInvocation(1)
//    @Threads(8)
    public long benchmark(NHolder nh, ClassHolder classHolder) {
        return classHolder.calc.fib(nh.n);
    }

    @State(Scope.Thread)
    public static class ClassHolder {
        @Param({
                "IterativeFibCalc",
                "IterativeMemorizedFibCalc",
                "MathFibCalc",
                "MatricesFibCalc",
                "MemorizedFibCalc",
                "RecursiveFibCalc",
                "SimplerIterativeFibCalc"
        })
        String calcClass;

        FibCalc calc;

        @Setup(Level.Invocation)
        public void setUp() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            calc = (FibCalc) Class.forName("org.qwertech.calculators." + calcClass).newInstance();
        }
    }

    @State(Scope.Benchmark)
    public static class NHolder {

        @Param({
                "5",
                "10",
                "15",
                "20",
                "25",
                "30",
                "35",
                "40",
                "45"
        })
        int n;
    }
}
