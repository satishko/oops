package oops;
class SuperClass{
int x,y;
void getxy() {
	x=200;
	y=150;
}
}
class Subclass1 extends SuperClass{
	int sum;
	void add() {
		sum=x+y;
		System.out.println("Addition="+sum);
	}
}
class subclass2 extends SuperClass{
	int s;
	void minus() {
		s=x-y;
		System.out.println("minus="+s);
	}
}
public class hierarchical {

	public static void main(String[] args) {
		Subclass1 obj1=new Subclass1();
		subclass2 obj2=new subclass2();
		obj1.getxy();
		obj2.getxy();
		obj1.add();
		obj2.minus();
		
	}

}
