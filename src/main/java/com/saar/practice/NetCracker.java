package com.saar.practice;


public class NetCracker {
    T1 thread = new T1();
    T2 thread2 = new T2();



    public static void main(String[] args) {
        NetCracker nt = new NetCracker();
        nt.thread.start();;
        nt.thread2.start();;
    }

}


class Resource1 {
    int id;

    public Resource1(int id) {
        this.id = id;
    }
}
class Resource2 {
    int id;

    public Resource2(int id) {
        this.id = id;
    }
}


class T1 extends  Thread{

    public void res(){

    }
    Resource1 resource1= new Resource1(10);;
    Resource2 resource2 = new Resource2(10);
    @Override
    public void run() {
        synchronized (resource1){
            System.out.println(resource1.id);
            synchronized (resource2)
            { System.out.println(resource2.id);}
        }
    }
}

class T2 extends Thread{

    Resource1 resource1= new Resource1(20);;
    Resource2 resource2 = new Resource2(20);
    @Override
    public void run() {
        synchronized (resource1){
            System.out.println(resource1.id);
            synchronized (resource2)
            { System.out.println(resource2.id);}
        }
    }


}
