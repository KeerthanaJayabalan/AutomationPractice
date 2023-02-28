package javaLearning;

public class ConstructorOverloading {
	// Constructor overloading in Java is having more than one parameter with different parameter lists.
	// They are arranged in a way that each constructor could perform different task
	// They are differentiated by the compiler by the number of parameters in the lists and its type. 
	
	
	int id;
	int age;
	String name;
	public ConstructorOverloading(int r, String nm) {
		id=r;
		name=nm;
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	public ConstructorOverloading(int i, int a, String n) {
		id=i;
		age=a;
		name=n;
		System.out.println("Name: "+name+" Id: "+id+" Age: "+age);
	}

	public static void main(String[] args) {
ConstructorOverloading constructorOverloading=new ConstructorOverloading(10, "Venu");
ConstructorOverloading constructorOverloading2=new ConstructorOverloading(12, 29, "Keerthana"); 
	}

}
