package com.lab1;

public class Triangle {
	public int a;
	public int b;
	public int c;
	Triangle(){
		a=1;
		b=1;
		c=1;
	}
	Triangle(int a1, int b1, int c1){
		if(a1+b1>c1 || a1+c1>b1 || b1+c1>a1){
		a=a1;
		b=b1;
		c=c1;
		}
		else
			System.out.println("It's not a triangle!");
	}
	Boolean equilateral(){
		if(this.a == this.b && this.b==this.c)
			return true;
		else
			return false;
	}
	Boolean isosceles(){
		if(this.a == this.b || this.a==this.c || this.b==this.c)
			return true;
		else
			return false;
	}
	Boolean scalene(){
		if(this.a != this.b && this.a != this.c && this.b != this.c)
			return true;
		else
			return false;
	}

}
