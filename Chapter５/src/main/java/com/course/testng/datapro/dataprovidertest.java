package com.course.testng.datapro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

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
@Test(dataProvider = "methodtest")
    public void test1(String name,int age){
        System.out.println("这是test111111方法name是"+name+"；年龄是"+age);
    }
    @Test(dataProvider = "methodtest")
    public void test2(String name,int age){
        System.out.println("这是test22222方法name是"+name+"；年龄是"+age);
    }
@DataProvider(name = "methodtest")
    public  Object[][] datatest(Method method){
     Object[][] res=null;
     if (method.getName().equals("test1")){
         res=new  Object[][]{
                 {"zhangsan",5}
                 ,{"lisi",6}
         };
     }else if (method.getName().equals("test2")){
         res=new Object[][]{
                 {"wangwu",50},{"zhaoliu",96}
         };
     }
     return  res;
    }
}
