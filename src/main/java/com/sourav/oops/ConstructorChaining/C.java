package com.sourav.oops.ConstructorChaining;

public class C extends B {
    public C() {
        System.out.println("C comes third");
    }

    public C(String str){
        System.out.println("C comes with 1 parameter");
    }
    public C(String A, int X){
        System.out.println("C comes with 2 parameters ");
    }
}
