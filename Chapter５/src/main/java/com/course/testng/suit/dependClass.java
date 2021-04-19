package com.course.testng.suit;

import org.testng.annotations.Test;

public class dependClass {
    @Test
    public void  test1(){
        System.out.println("test1");
        throw new  RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void  test2(){
        System.out.println("test2");
    }
}
