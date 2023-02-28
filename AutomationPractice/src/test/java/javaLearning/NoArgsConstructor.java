package javaLearning;

public class NoArgsConstructor {
	int a=10, b=5;
	String name="Keerthana";
	//Constructor which has no args is called no args constructor 
	public NoArgsConstructor() {
System.out.println(a);
System.out.println(b);
System.out.println(name);
	}
	
public static void main(String[] args) {
	NoArgsConstructor argsConstructor=new NoArgsConstructor();
}
}
