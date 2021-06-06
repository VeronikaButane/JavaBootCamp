package sef.finalActivity.activity_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator {
    public void print(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%10d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Calculator table = new Calculator();
        table.print(10);
    }


    public static int getSum(int a, int b) {
        return a + b;
    }


}
