package com.saar.multithreading;

import static java.lang.String.format;

public class NotifyThread {
    public static void main(String[] args) {
        System.out.println("Strarting thread");
        Thread t = new TestRun();
        Thread t1 = new TestRun1();
        t.setName("Thread1");
        t1.setName("Thread2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);

        t.start();
        t1.start();

    }
}

class Task {
    public double div(double a, double b) throws ThreadExceptionHandler {
            if (b <= 0 )
                throw new ThreadExceptionHandler("Divisor can not not less then 1 :" + b);
            return a / b;
    }
}

class ThreadExceptionHandler extends Throwable implements Thread.UncaughtExceptionHandler{

    ThreadExceptionHandler(String message) {
        super(message);
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("UncaughtException: "+ t.getName() + e.getMessage());

    }
}

class TestRun extends Thread{

    public void run(){
        Task t = new Task();
        double result = 0;
        try {
            result = t.div(4,5);
        } catch (ThreadExceptionHandler e) {
            e.uncaughtException(this, e);
        }

        System.out.println(String.format("Current thread %s and result %s ", Thread.currentThread(), result));

    }
}

class TestRun1 extends Thread{

    public void run(){
        Task t = new Task();
        double result = 0;
        try {
            result = t.div(4,0);
        } catch (ThreadExceptionHandler e) {
            e.uncaughtException(this, e);
        }

        System.out.println(String.format("Current thread %s and result %s ", Thread.currentThread(), result));

    }
}


