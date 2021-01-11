package com.saar;

public class Main {
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        doPrint(x);
        doPrint(y);
        doPrint(z);
    }
    public static void doPrint(Base o){
        o.print();
    }
}

class Base {
    public void print(){
        System.out.println("Base");
    }
}

class Derived  extends Base{
    @Override
    public void print() {
        System.out.println("Derived");
    }
}
