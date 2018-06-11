# fibonachi-benchmark [![Build Status](https://travis-ci.org/QwerTech/fibonachi-benchmark.svg?branch=master)](https://travis-ci.org/QwerTech/fibonachi-benchmark) [![codecov](https://codecov.io/gh/QwerTech/fibonachi-benchmark/branch/master/graph/badge.svg)](https://codecov.io/gh/QwerTech/fibonachi-benchmark)
Compare fibonachi calculation speed through cycle via recursive calculation and mesuare by JMH

### JMH execution log
https://gist.github.com/QwerTech/0ddd3367685f4c62523317f6ee82521b

### Benchmark results
![](https://github.com/QwerTech/fibonachi-benchmark/raw/master/graph.png)

| calcClass | index | Mode | Cnt | Score | Error | Units |
|---|---|---|---|---|---|---|
| org.qwertech.CycleFibCalc | 5 | thrpt | 200 | 33129482.506 | ± 311934.001 | ops/s |
|org.qwertech.CycleFibCalc| 10|thrpt|200|34182859.361|± 491875.643|ops/s|
|org.qwertech.CycleFibCalc| 20|thrpt|200|32869043.734|± 403266.387|ops/s|
|org.qwertech.CycleFibCalc| 40|thrpt|200|28663184.021|± 230258.141|ops/s|
|org.qwertech.RecursiveFibCalc|5|thrpt|200|22652584.235|± 179932.003|ops/s|
|org.qwertech.RecursiveFibCalc| 10|thrpt|200| 3566727.398|± 29306.560|ops/s|
|org.qwertech.RecursiveFibCalc| 20|thrpt|200| 31807.095|± 128.767|ops/s|
|org.qwertech.RecursiveFibCalc| 40|thrpt|200| 2.103|± 0.013|ops/s|
