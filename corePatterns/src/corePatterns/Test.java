package corePatterns;

public class Test {

	public static void main(String[] args) {

		Singleton singleton1=Singleton.getinstance();
		Singleton singleton2=Singleton.getinstance();
		
		   System.out.println(singleton1 == singleton2) ;
		
	}

}
