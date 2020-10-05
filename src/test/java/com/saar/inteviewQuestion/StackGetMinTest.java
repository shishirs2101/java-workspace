package com.saar.inteviewQuestion;

import org.junit.Assert;
import org.junit.Test;


import static com.saar.inteviewQuestion.StackGetMin.push;
import static com.saar.inteviewQuestion.StackGetMin.display;
import static com.saar.inteviewQuestion.StackGetMin.getMin;
import static com.saar.inteviewQuestion.StackGetMin.pop;


public class StackGetMinTest{

    @Test
    public void getMin1(){

        push(4);
        push(5);
        push(1);
        push(10);
        push(3);
        display();
        System.out.println(getMin());
        pop();
        pop();
        System.out.println(getMin());
        display();
        pop();
        display();
        push(2);
        display();
        System.out.println(getMin());
        Assert.assertEquals(2,2);
    }

}