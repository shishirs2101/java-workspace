package com.saar.onlinetest.sapiens;

public class Program {
    int count =0;
    public static final Program  getSing(){
        return new Program();
    }
    private void add(int i ){
        count +=i;
    }
    private int getCount(){
        return count;
    }

    public static void main(String[] args) {
       try{
           int i =10/0;
       }catch (ArithmeticException ae){
           System.out.println(1);
       }catch (ArrayIndexOutOfBoundsException ab){
           System.out.println(2);
       }catch (Exception e){
           System.out.println(3);
       }finally {
           System.out.println(4);
       }
        System.out.println(5);


    }

}
