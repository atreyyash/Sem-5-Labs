class Parent { 
	void DisplayA() { 
		System.out.println("This is a content of parent class"); 
	} 
}

//B.java  
class Child1 extends Parent { 
	void DisplayB() { 
		System.out.println("This is a content of child class 1"); 
	} 
} 

//c.java 
class Child2 extends Parent { 
	void DisplayC() { 
		System.out.println("This is a content of child class 2"); 
	} 
} 

//MainClass.java 
class Heirarichal { 
	public static void main(String args[]) { 
		System.out.println("Calling for child class C"); 
		Child2 b = new Child2(); 
		b.DisplayA(); 
		b.DisplayC(); 
		System.out.println("Calling for child class B"); 
		Child1 a = new Child1(); 
		a.DisplayA();
		a.DisplayB();
	} 
} 