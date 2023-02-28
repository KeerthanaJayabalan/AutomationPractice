package javaLearning;

public class ParametrisedConstructor {
	String name;
	int age;
	
	// A constructor which has specific number of parameters is called parameterised constructor
	//A parameterised constructor is used to provide different values to distinct objects
	
	public ParametrisedConstructor(String nm, int a) {
		name=nm;
		age=a;
		System.out.println("Name: "+name+" Age: "+age);
	}

	public static void main(String[] args) {

		ParametrisedConstructor constructor=new ParametrisedConstructor("Keerthana", 29);
		ParametrisedConstructor constructor2=new ParametrisedConstructor("Venu", 30);
		ParametrisedConstructor constructor3=new ParametrisedConstructor("Vamika", 1);

	}

}
