package com.course.testng;

import org.testng.annotations.*;

/**
 * @author a-liuqian
 */
public class basicAnnotation {
//最基本的注解 用来把方法标记为测试的一部分
    @Test
    public void testCase(){
        System.out.print("this is case 1  testCase");
    }

    @Test
    public void testCase2(){
        System.out.print("this is case 2  testCase");
    }

    @BeforeMethod
    public  void  beforeMethod(){
        System.out.print("这是在beforeMethod=====1");
    }
    @AfterMethod
    public void  afterMethod(){
        System.out.print("这个是aftermethod======1");
    }

    @BeforeClass
    public  void  beforeClass(){
        System.out.print("这是beforeClass");
    }

    @AfterClass
    public  void  afterClass() {
        System.out.print("这是afterClass");
    }
    @BeforeSuite
    public  void  beforesuit(){
        System.out.print("这是beforesuit");
    }
    @AfterClass
    public void  aftersuit(){
        System.out.print("这是aftersuit");
    }
}

