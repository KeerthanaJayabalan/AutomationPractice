package javaLearning;

public class StacticMethod {
	int id=10;
	static String collgeName="NGP";



	private static void change() {
		//A static method can access static data member and can change a value of it
		collgeName="KCT";
	}
	private void display() {
		System.out.println(id);
		System.out.println(collgeName);
		change(); // we can call static method from non-static method
	}
	public static void main(String[] args) {
		StacticMethod method=new StacticMethod();
		method.display();
		method.display();

	}

}
