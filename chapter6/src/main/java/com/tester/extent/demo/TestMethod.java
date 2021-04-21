package com.tester.extent.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author liuqian
 */
public class TestMethod {
    @Test
    public void  test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void  test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void  test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public  void  logDemo(){
        Reporter.log("message  ======myself");
        throw  new RuntimeException("runtime exceptoion");
    }
}
