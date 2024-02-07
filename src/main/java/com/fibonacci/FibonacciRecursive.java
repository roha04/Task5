package com.fibonacci;

public class FibonacciRecursive {
    //Time complexity:O(2^n)
    //Space complexity: O(n)
    public static long fibonacci(int n){
        if (n < 2) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
