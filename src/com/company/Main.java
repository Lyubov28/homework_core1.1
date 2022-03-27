package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(6, 2);
        int d = calc.multiply.apply(6, 2);


        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
    }
}
