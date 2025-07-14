package com.java.wrokshope.tempreaturedata.beans.src.com.java.tempreaturedata.beans;

public class Tempretureapplication {
    public static void main(String[]args){
        Organization vet=new Organization("Vellalar","Thindal","www.vet.com","Contact@vet.com","+91-9087654321",200938457,Localdate.of(2007));
        System.out.println(vet);
        System.out.println(vet.name());
        System.out.println(vet.completeaddress());
        System.out.println(vet.website());
        System.out.println(vet.email());
        System.out.println(vet.contact());
        System.out.println(vet.registrationNumber());
        System.out.println(vet.registrationData());
    }

}
