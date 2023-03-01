package javaLearning;

public class OverloadinMainMethod {
	
	
public static void main(String[] args) {
	System.out.println("Main method");
	main(5); //calling another main method
}
public static void main(int a) { //overloading
	System.out.println("Main method overloading");
}
}
