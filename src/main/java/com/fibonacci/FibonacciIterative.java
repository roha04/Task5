package com.fibonacci;

public class FibonacciIterative {

    //Time complexity: O(n)
    //Space complexity: O(1)
    public static long fibonacci(int n) {
        int previousTerm = 0;
        int currentTerm = 1;
        int nextTerm;
        if (n == 0)
            return previousTerm;
        for (int i = 2; i <= n; i++) {
            nextTerm = previousTerm + currentTerm;
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
        return currentTerm;
    }

}
