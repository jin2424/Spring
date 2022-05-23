package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class for_if {
    public static int countfruit(String give) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (fruit == give) {
                count += 1;
            }
        }
        return count;
    }
        public static void main(String[] arg){
        int gam = countfruit("감");
        int subak = countfruit("수박");
        int melon = countfruit("메론");
        int sberry = countfruit("딸기");
        int bae = countfruit("배");
        int count = gam+subak+melon+sberry+bae;

            System.out.println("감: "+ gam + "개" );
            System.out.println("수박: "+ subak + "개" );
            System.out.println("메론: "+ melon + "개" );
            System.out.println("딸기: "+ sberry + "개" );
            System.out.println("배: "+ bae + "개" );
            System.out.println("총합은: " + count + "개");
        }
}


