package oops;

public class CompileTimePloymorphism {
public static void add() {
	System.out.println("add without args");
}
public static void add(int i) {
	System.out.println("add with int agrs");
}
public static void add(int i,double d) {
	System.out.println("add with int,double agrs");
}
public static void add(String s) {
	System.out.println("add with String args");
}
	public static void main(String[] args) {
		add();
	add("satish"); 
	add(130);
	add(20000,564.6700);
	}

}
