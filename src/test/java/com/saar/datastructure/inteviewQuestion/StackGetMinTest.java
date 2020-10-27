package com.saar.datastructure.inteviewQuestion;

import org.junit.Assert;
import org.junit.Test;


public class StackGetMinTest{

    @Test
    public void getMin1(){

        StackGetMin.push(4);
        StackGetMin.push(5);
        StackGetMin.push(1);
        StackGetMin.push(10);
        StackGetMin.push(3);
        StackGetMin.display();
        System.out.println(StackGetMin.getMin());
        StackGetMin.pop();
        StackGetMin.pop();
        System.out.println(StackGetMin.getMin());
        StackGetMin.display();
        StackGetMin.pop();
        StackGetMin.display();
        StackGetMin.push(2);
        StackGetMin.display();
        System.out.println(StackGetMin.getMin());
        Assert.assertEquals(2,2);
    }

}