package org.example;


public class Main {
    public static void main(String[] args) {

        double a = -1.1;
        double x = 2;
        double c = -3;
        double b = -2.14;

        double y = c * x / (b * Math.pow(x, 3) - 3);

        double result = a * Math.log(y) / (Math.exp(a * x) + c * Math.log(x - a));

        System.out.println(result);
    }
}