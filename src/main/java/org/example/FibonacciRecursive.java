package org.example;

public class FibonacciRecursive {
    //Часова складність O(n)
    //Просторова складність O(n)
    public int findValueByIndex(int n) {
        return findValueByIndexRecursive(0,1, n);
    }
    private int findValueByIndexRecursive(int f1, int f2, int n) {
        if(n==0){
            return f1;
        }
        return findValueByIndexRecursive(f2, f1+f2, n-1);
    }
}
