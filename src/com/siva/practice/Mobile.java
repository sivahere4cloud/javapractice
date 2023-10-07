package com.siva.practice;

public class Mobile {
    String sim;
    String networkType;
    long mobileNumber;
    int cost;

    public static void showall(Mobile mobile){
        System.out.println("in side static method...........");
        System.out.println(mobile.sim+" "+mobile.mobileNumber+" "+mobile.cost+" "+mobile.networkType);
    }
}
