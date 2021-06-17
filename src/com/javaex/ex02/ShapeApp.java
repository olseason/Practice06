package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");                        //예상 
		System.out.println("================");                      // 부모에 관한 메소드 먼저 실행 -> 자식 실행 
		
		Triangle t1 = new Triangle();                                // 자식에 관한 메소드가 있어도, 부모 메소드 먼저 실행  
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

