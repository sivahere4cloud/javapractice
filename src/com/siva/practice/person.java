package com.siva.practice;

public class person {
    private String name;
    private String snof;
    private long mobile;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSnof(String snof){
        this.snof=snof;
    }

    public String getSnof(){
        return snof;
    }

    public void setMobile(Long mobile){
        this.mobile=mobile;
    }

    public long getMobile(){
        return mobile;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", snof='" + snof + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
