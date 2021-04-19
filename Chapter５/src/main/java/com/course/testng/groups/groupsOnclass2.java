package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnclass2 {

    public void stu1(){
        System.out.println(" 111111111运行");
    }
    public void stu2(){
        System.out.println(" 22222222222运行");
    }
}
