package com.sparta.week01.prac;

public class Prac {
    // 파라미터 O, 반환값 X
    public static int minus(int num1, int num2) {
        return num1-num2;
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args){
        int result = minus(10, 3);
        System.out.println(result);
    }
}


