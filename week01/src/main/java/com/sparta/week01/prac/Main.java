package com.sparta.week01.prac;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: " );

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0){
            if (y > 0){
                System.out.println("1사분면");
            }else{
                System.out.println("4사분면");
            }
        }
        if (x < 0){
            if (y > 0){
                System.out.println("2사분면");
            }else{
                System.out.println("3사분면");
            }
        }
    }
}

