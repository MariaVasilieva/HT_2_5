package org.example;

import java.util.HashMap;

public class FibonacciDynamic {
    //Часова складність O(n) гірший випадок і О(1) кращий випадок
    //Просторова складність O(n)
    private HashMap<Integer, Integer> fibonacciSequence = new HashMap<Integer, Integer>();
    public int findValueByIndex(int n) {
        if (fibonacciSequence.containsKey(n)) {
            return fibonacciSequence.get(n);
        }
        int value;
        if (n <= 1) {
            value = n;
        } else {
            value = findValueByIndex(n - 1) + findValueByIndex(n - 2);
        }
        fibonacciSequence.put(n, value);
        return value;
    }
}
