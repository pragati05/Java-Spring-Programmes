package testPrgram.java;

import java.lang.reflect.Constructor;

interface A{
	public void show();
}
interface B extends A{
	public void show1();
}
class C implements B{
	public void show(){
		
	}
	public void show1(){
		System.out.println();
	}
}

public class Say {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		s.deleteCharAt(0);
		System.out.println("test: "+ s);
		Constructor[] cs = Say.class.getDeclaredConstructors();
		for(Constructor c:cs){
			c.set
		}
		
		
		Object obj = null;
	}
}
