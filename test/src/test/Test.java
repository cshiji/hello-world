package test;

import test.Color;
public class Test {
	Color color;
	public static void main(String[] args) {
	   Test test=new Test();
	   test.print();
	}
	public void print(){
		switch (Color.tuandai_getProject) {
		case tuandai_addProject:
			  System.out.println("1");
			break;
		case tuandai_getProject:
			System.out.println("2");
			break;
		}
	}
}
