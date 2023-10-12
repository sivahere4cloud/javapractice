package com.siva.practice;

import java.util.List;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("main class...");
//        List ls=new ArrayList();
//        ls.add(10);
//        ls.add("siva");
//        ls.add("ganesh");
//        ls.add(10.42);
//
//        for(Object s:ls){
//            System.out.println(s);
//        }

        List<Integer> ls=new ArrayList<>();
       // ls.add("siva");
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        for(Integer in:ls){
            System.out.println(in);
        }
    }
}
