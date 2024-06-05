package org.example;

public class FibonacciIterate {
    //Часова складність O(n)
    //Просторова складність O(1)
    public static int findValueByIndex(int n) {
        if(n==0){
            return 0;
        }
        int f1 = 0, f2 = 1;
        int f3 = f1 + f2;
        for (int i = 2; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
