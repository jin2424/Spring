package com.sparta.week01.prac;

import java.util.Scanner;

public class trutle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 10개를 입력하세요: ");
        int n = sc.nextInt();

        int sum= 0;

        for (int i=0; i<=n; i++){
            if(i%2==0)
                sum=sum +i;
        }
        System.out.println(sum);
    }
}

