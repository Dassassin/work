package day16.problem07;

import day16.problem07.service.Calculator;

public class Test7 {
    public static void main(String[] args) {
        invokeCalc(130, 120, (int a, int b) -> {
            return a - b;
        });
        invokeCalc(130, 120, (a, b) -> a - b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
