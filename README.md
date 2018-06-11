# fibonacci-benchmark [![Build Status](https://travis-ci.org/QwerTech/fibonacci-benchmark.svg?branch=master)](https://travis-ci.org/QwerTech/fibonacci-benchmark) [![codecov](https://codecov.io/gh/QwerTech/fibonacci-benchmark/branch/master/graph/badge.svg)](https://codecov.io/gh/QwerTech/fibonacci-benchmark)
Compare fibonacci calculation speed through cycle via recursive calculation and mesuare by JMH

### JMH execution log
https://gist.github.com/QwerTech/fe3371d8faf4cadcf5e0eb5f467cb2fb

### Benchmark results
![](https://github.com/QwerTech/fibonacci-benchmark/raw/master/graph1.png)

|(calcClass)|(n)|Mode|Cnt|Score|Error|Units|
|---|---:|---|---|---:|---:|---|
|IterativeFibCalc|5|thrpt|200|32922755.456|± 704437.624|ops/s|
|IterativeFibCalc|10|thrpt|200|33872599.934|± 572545.691|ops/s|
|IterativeFibCalc|15|thrpt|200|31767376.851|± 467652.865|ops/s|
|IterativeFibCalc|20|thrpt|200|33461058.956|± 208007.704|ops/s|
|IterativeFibCalc|25|thrpt|200|29445740.302|± 384396.397|ops/s|
|IterativeFibCalc|30|thrpt|200|29621950.976|± 364047.849|ops/s|
|IterativeFibCalc|35|thrpt|200|31461916.694|± 298950.899|ops/s|
|IterativeFibCalc|40|thrpt|200|28148454.798|± 324697.567|ops/s|
|IterativeFibCalc|45|thrpt|200|29103050.817|± 234626.815|ops/s|
|IterativeMemorizedFibCalc|5|thrpt|200|23848217.989|± 232683.591|ops/s|
|IterativeMemorizedFibCalc|10|thrpt|200|23376884.822|± 206942.124|ops/s|
|IterativeMemorizedFibCalc|15|thrpt|200|21844941.947|± 229856.023|ops/s|
|IterativeMemorizedFibCalc|20|thrpt|200|19813268.842|± 164492.466|ops/s|
|IterativeMemorizedFibCalc|25|thrpt|200|14384646.282|± 75023.355|ops/s|
|IterativeMemorizedFibCalc|30|thrpt|200|13311986.274|± 126778.285|ops/s|
|IterativeMemorizedFibCalc|35|thrpt|200|13554328.257|± 108160.331|ops/s|
|IterativeMemorizedFibCalc|40|thrpt|200|11703545.757|± 57354.602|ops/s|
|IterativeMemorizedFibCalc|45|thrpt|200|10654502.735|± 82188.154|ops/s|
|MathFibCalc|5|thrpt|200|5697155.375|± 20701.829|ops/s|
|MathFibCalc|10|thrpt|200|5842165.194|± 13096.589|ops/s|
|MathFibCalc|15|thrpt|200|5613651.133|± 21650.002|ops/s|
|MathFibCalc|20|thrpt|200|5804654.131|± 14441.019|ops/s|
|MathFibCalc|25|thrpt|200|5711142.594|± 15743.773|ops/s|
|MathFibCalc|30|thrpt|200|5797681.365|± 28054.111|ops/s|
|MathFibCalc|35|thrpt|200|5709074.296|± 16623.798|ops/s|
|MathFibCalc|40|thrpt|200|5858356.589|± 14007.745|ops/s|
|MathFibCalc|45|thrpt|200|5830458.682|± 21038.151|ops/s|
|MatricesFibCalc|5|thrpt|200|25173219.423|± 230221.678|ops/s|
|MatricesFibCalc|10|thrpt|200|24045778.583|± 285293.325|ops/s|
|MatricesFibCalc|15|thrpt|200|22755610.283|± 193421.277|ops/s|
|MatricesFibCalc|20|thrpt|200|23924793.993|± 223819.710|ops/s|
|MatricesFibCalc|25|thrpt|200|23265229.169|± 129653.861|ops/s|
|MatricesFibCalc|30|thrpt|200|22969839.503|± 209556.968|ops/s|
|MatricesFibCalc|35|thrpt|200|21709199.244|± 197358.835|ops/s|
|MatricesFibCalc|40|thrpt|200|22097820.097|± 303837.466|ops/s|
|MatricesFibCalc|45|thrpt|200|21310054.561|± 186448.184|ops/s|
|MemorizedFibCalc|5|thrpt|200|16637499.315|± 165767.807|ops/s|
|MemorizedFibCalc|10|thrpt|200|11195751.954|± 98563.347|ops/s|
|MemorizedFibCalc|15|thrpt|200|7961352.432|± 137671.366|ops/s|
|MemorizedFibCalc|20|thrpt|200|6576502.590|± 61995.241|ops/s|
|MemorizedFibCalc|25|thrpt|200|5333555.745|± 33563.363|ops/s|
|MemorizedFibCalc|30|thrpt|200|4607721.462|± 36263.344|ops/s|
|MemorizedFibCalc|35|thrpt|200|4099034.486|± 34838.592|ops/s|
|MemorizedFibCalc|40|thrpt|200|3569206.443|± 28257.265|ops/s|
|MemorizedFibCalc|45|thrpt|200|3191943.446|± 18054.619|ops/s|
|RecursiveFibCalc|5|thrpt|200|22325287.481|± 281845.687|ops/s|
|RecursiveFibCalc|10|thrpt|200|3572492.892|± 20166.988|ops/s|
|RecursiveFibCalc|15|thrpt|200|346025.012|± 1831.250|ops/s|
|RecursiveFibCalc|20|thrpt|200|31828.818|± 135.066|ops/s|
|RecursiveFibCalc|25|thrpt|200|2870.654|± 11.219|ops/s|
|RecursiveFibCalc|30|thrpt|200|258.569|± 1.576|ops/s|
|RecursiveFibCalc|35|thrpt|200|23.375|± 0.123|ops/s|
|RecursiveFibCalc|40|thrpt|200|2.086|± 0.029|ops/s|
|RecursiveFibCalc|45|thrpt|200|0.190|± 0.001|ops/s|
|SimplerIterativeFibCalc|5|thrpt|200|34090872.766|± 632534.497|ops/s|
|SimplerIterativeFibCalc|10|thrpt|200|34028111.738|± 400766.600|ops/s|
|SimplerIterativeFibCalc|15|thrpt|200|31420989.141|± 258048.654|ops/s|
|SimplerIterativeFibCalc|20|thrpt|200|31468231.689|± 204158.310|ops/s|
|SimplerIterativeFibCalc|25|thrpt|200|31326771.774|± 350781.249|ops/s|
|SimplerIterativeFibCalc|30|thrpt|200|29477202.895|± 198117.930|ops/s|
|SimplerIterativeFibCalc|35|thrpt|200|29361013.452|± 174319.445|ops/s|
|SimplerIterativeFibCalc|40|thrpt|200|26738105.576|± 269130.934|ops/s|
|SimplerIterativeFibCalc|45|thrpt|200|26538235.777|± 247394.215|ops/s|

### Test enviroment
|Item|Value|
|---|---|
|OS Name|Microsoft Windows 10 Enterprise|
|System Model|HP EliteBook 840 G4|
|System Type|x64-based PC|
|Processor|Intel(R) Core(TM) i5-7300U CPU @ 2.60GHz, 2712 Mhz, 2 Core(s), 4 Logical Processor(s)|
|Physical Memory (RAM)|16.0 GB|
|Oracle Java|1.8_171|
