package javaLearning;

public class StaticVariable {
static int count=0; //static variable
int a=0; //non-static variable

public StaticVariable() {
count++; // it is declared as static, so it stored last updated value
System.out.println(count);
}
private void nonStatic() {
a++; // every time the value initializing
System.out.println(a);
}
	public static void main(String[] args) {
StaticVariable variable=new StaticVariable();
StaticVariable variable2=new StaticVariable();
variable.nonStatic();
variable2.nonStatic();
	}

}
