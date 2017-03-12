package com.lab1;

//import org.junit.Before;  
import org.junit.Test;  
// 静态导入  
import static org.junit.Assert.*;

public class TestTriangle {	
	/*@Before  
    public void setUp(){  
        s = new Triangle();  
    }*/
	@Test  
    public void testEquilateral(){
		Triangle s=new Triangle(1,1,1);
        /* 
         * 以下是一个简单的断言的编写 
         * 第一个参数是如果出错给出的提示信息 
         * 第二个表示期望值，通常是用户指定的内容 
         * 第三个表示代码返回的实际值 
         */  
    //  Assert.assertEquals("Equilateral is fault", true, s.equilateral());  
        /* 
         * 由于包进行了静态导入之后 
         * Assert中的所有静态方法就不用再添加类名了 
         * 这样可以有效地兼容junit3 
         */  
        assertEquals("Equilateral is fault", true, s.equilateral());  
    }
	@Test
	public void testIsosceles(){
		Triangle s= new Triangle(2,2,3);
		assertEquals("Isosceles is fault", true, s.isosceles());
	}
	@Test
	public void testScalene(){
		Triangle s=new Triangle(2,3,4);
		assertEquals("Scalene is fault", true, s.scalene());
	}

}
