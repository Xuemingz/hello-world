package com.lab1;

//import org.junit.Before;  
import org.junit.Test;  
// ��̬����  
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
         * ������һ���򵥵Ķ��Եı�д 
         * ��һ����������������������ʾ��Ϣ 
         * �ڶ�����ʾ����ֵ��ͨ�����û�ָ�������� 
         * ��������ʾ���뷵�ص�ʵ��ֵ 
         */  
    //  Assert.assertEquals("Equilateral is fault", true, s.equilateral());  
        /* 
         * ���ڰ������˾�̬����֮�� 
         * Assert�е����о�̬�����Ͳ�������������� 
         * ����������Ч�ؼ���junit3 
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
