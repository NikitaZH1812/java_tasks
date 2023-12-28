package fib;
import java.util.stream.Stream;

public class fib {
    static int calculateFibonacci(int num) {
        int res = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(num - 1)
                .reduce((arr1, arr2) -> arr2)
                .orElse(new int[]{num <= 1 ? num : 0, 0})[1];

        return res;
    }
}
