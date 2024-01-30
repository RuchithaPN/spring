package corePatterns;

public class Singleton {
	
	private static Singleton instance;    //lazy initilization
	
	private Singleton() {    //constructor

	}
	
	public static Singleton getinstance() {         //public static method
		if (instance == null) {  
			instance = new Singleton();  
			} 
		return instance;
	}

}


/*
public class Singleton {
	
	private static Singleton instance=new Singleton();    //Eager initilization
	
	private Singleton() {    //constructor

	}
	
	public static Singleton getinstance() {         //public static method
		return instance;
	}

}
*/
/*
Making thread safe

public class Singleton {
	
	private static Singleton instance;    //lazy initilization
	
	private Singleton() {    //constructor

	}
	
	public static Singleton getinstance() {         //public static method
	
	synchronized(Singleton.class){
		if (instance == null) {  
			instance = new Singleton();  
			} 
			}
		return null;
	}

}

*/

/*
public enum EnumSingleton {
INSTANCE; // Single instance for the enum

}
*/