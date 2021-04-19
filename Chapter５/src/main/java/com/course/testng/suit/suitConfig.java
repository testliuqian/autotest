package com.course.testng.suit;

import org.testng.annotations.*;

public class suitConfig {
    @BeforeSuite
    public void  beforesuit(){
        System.out.println("这是beforesuit");
    }
    @AfterSuite
    public void  aftersuit(){
        System.out.println("这是aftersuit");
    }
    @BeforeTest
    public void  beforeclass(){
        System.out.println("这是beforeclass");
    }
    @AfterTest
    public  void afterclass(){
        System.out.println("这是afterclass");
    }
}
