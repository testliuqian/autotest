package com.course.testng.datapro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertest {
    @Test(dataProvider = "data")
    public void  testDataprovider(String name ,int age){
        System.out.println("name is "+name+";-------age is "+age);
    }
    @DataProvider(name = "data")
    public  Object [][] provider(){
        Object[][] o =new Object[][]{
                {"zhangsan",10},{"lisi",11},{"wangwu",12}
        };
        return  o;
    }
}
