package com.siva.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Mappractice {
    public static void main(String[] args) {
        System.out.println("Main class.....");

        Map<String,Integer> cl=new HashMap<String,Integer>();
        cl.put("number",10);
        cl.put("contact",108);
        cl.put("police",100);
        cl.put("fire",101);

       System.out.println(cl.keySet());
        System.out.println(cl.values());

        System.out.println("==============================");

        for(String key:cl.keySet()){
            System.out.println(key+" : "+cl.get(key));
        }



    }
}
