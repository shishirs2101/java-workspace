package com.saar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class TempTest {
    public static void main(String[] args) {
      /*new Thread3().start();
      new Thread3(new MyRunnable()).start();*/
        A a =new A("tea");
        A b =new A("cofee");
        TreeSet<A> treeSet =new TreeSet<>();
        treeSet.add(b);
        treeSet.add(a);

        for (A as:treeSet) {
            System.out.println(as.toString());
        }


    }
}

class A implements Comparable {
    private String s;

    public A(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "A{" +
                "s='" + s + '\'' +
                '}';
    }

    final public void m(){
        System.out.println("test1");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


class Thread3 extends   Thread {
    public Thread3() {
    }

    public Thread3(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println("Inside Thread");
    }
}


class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside runnable");
    }
}

