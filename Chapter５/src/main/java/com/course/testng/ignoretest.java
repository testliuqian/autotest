package com.course.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoretest {

    @Test
    public void  ignore1(){
        System.out.println("ignore 1");
    }
@Test(enabled = false)
    public void  ignore2(){
        System.out.println("ignore 2");
    }
@Test(enabled = true)
    public void  ignore3(){
        System.out.println("ignore 3");
    }
}
