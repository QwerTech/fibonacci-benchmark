package org.qwertech;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * BenchmarkRunner.
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
    public long benchmark(ExecutionParams params) {
        return params.calc.fib(params.index);
    }

    @State(Scope.Benchmark)
    public static class ExecutionParams {
        @Param({"org.qwertech.CycleFibCalc", "org.qwertech.RecursiveFibCalc"})
        String calcClass;

        @Param({"5", "10", "20", "40"})
        int index;

        FibCalc calc;

        @Setup(Level.Invocation)
        public void setUp() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            calc = (FibCalc) Class.forName(calcClass).newInstance();
        }
    }
}
