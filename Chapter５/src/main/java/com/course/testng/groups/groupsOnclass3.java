package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class groupsOnclass3 {
    public void tea1(){
        System.out.println(" tea1运行");
    }

    public void tea2(){
        System.out.println(" tea2运行");
    }
}
