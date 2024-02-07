package com.fibonacci;
import java.util.Map;
import java.util.HashMap;

public class FibonacciDP {
    //Time complexity:0(n)
    //Space complexity:O(n)
    private static final Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }

}
