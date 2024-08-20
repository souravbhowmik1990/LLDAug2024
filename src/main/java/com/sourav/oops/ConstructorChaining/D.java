package com.sourav.oops.ConstructorChaining;

public class D extends C{
    public D() {
    // call the constructor of c at the first line
        super("Scaler", 5); // it should be the first statement inside the constructor.
        System.out.println("D comes last");
    }

    public void sourav(){
        System.out.println("output of D");
    }
}
