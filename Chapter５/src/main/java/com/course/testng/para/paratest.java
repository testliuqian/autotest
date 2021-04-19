package com.course.testng.para;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paratest {
    @Test
    @Parameters({"name","age"})
    public  void  paratest(String name,int age){
        System.out.println("name ="+name+";====age="+age);
    }
}
