package com.course.testng.groups;

import org.testng.annotations.Test;

public class exception {
//    在期望结果为某个异常的时候 传入某些不合法的异常  程序抛出的异常
//    这是测试结果为异常的厕所
    @Test(expectedExceptions = RuntimeException.class)
    public  void  runTime(){
        System.out.println("这是一个异常");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public  void  runSuce(){
        System.out.println("抛出异常测试");
        throw new RuntimeException();
    }
}
