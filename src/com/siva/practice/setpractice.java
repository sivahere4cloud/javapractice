package com.siva.practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setpractice {
    public static void main(String[] args) {
        Set<Integer> ls=new HashSet<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        ls.add(30);
        ls.add(40);
        ls.add(50);


        Collection<Integer> ls1 =new TreeSet<Integer>();
        ls1.add(10);
        ls1.add(40);
        ls1.add(30);
        ls1.add(20);
        ls1.add(50);
        ls1.add(40);

//        for(Integer int1:ls1){
//            System.out.println(int1);
//        }

        for(Object obj:ls){
            System.out.println(obj);
        }

    }
}
