package com.course.testng;

import org.testng.annotations.Test;

public class timeout {
@Test(timeOut = 3000)
    public  void  test() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 3000)
    public  void  test1() throws InterruptedException {
        Thread.sleep(5000);
    }
}
