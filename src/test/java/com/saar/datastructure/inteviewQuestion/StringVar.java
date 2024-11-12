package com.saar.datastructure.inteviewQuestion;

public class StringVar {
    public  void foo(String errorMsg){
        errorMsg = "Test1";
        System.out.println(errorMsg);
    }

    public void fooMain(){
        String str = "fooMain";
        foo(str);
        System.out.println("FooMain(): " +str);
    }
    public void fooInt(Integer i){
        i = i+12;
    }

    public  void intMain(){
        int i = 1;
        fooInt(i);
        System.out.println("intMain()"+i);
    }

    public static void main(String[] args) {
        String str = "main";
        String str1 = "main";
        String s = new String("obj");
        String s1 = new String("obj");

        StringVar stringVar = new StringVar();
        stringVar.foo(str);
        int i = 3;
        stringVar.fooInt(i);
       // System.out.println(str);
       // stringVar.fooMain();
      //  System.out.println(i);
        //stringVar.intMain();
    }
}
