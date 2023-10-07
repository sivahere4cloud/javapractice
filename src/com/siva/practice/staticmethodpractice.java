package com.siva.practice;

public class staticmethodpractice {


    public static void main(String[] args) {

        Mobile mb=new Mobile();
        mb.sim="Airtel";
        mb.cost=25;
        mb.mobileNumber=8866303583L;
        mb.networkType="4g";
        Mobile.showall(mb);
    }
}
