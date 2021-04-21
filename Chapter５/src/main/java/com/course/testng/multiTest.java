package com.course.testng;

import org.testng.annotations.Test;

public class multiTest {
    @Test
    public void test1(){
        System.out.println("zheshi test1 %s%n"+Thread.currentThread().getId());
    }
@Test
    public void test2(){
        System.out.println("zheshi test2 : "+Thread.currentThread().getId());
    }
@Test(invocationCount = 3,threadPoolSize = 2)
    public void test3(){
        System.out.println("zheshi test3 %s%n"+Thread.currentThread().getId());
    }
}
