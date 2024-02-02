package oops;
class GrandParent{
	String name="veeraswami";
	String surname="kodavati";
void grandparentinfo() {
	System.out.println("-----------Grandparent details----------");
	System.out.println("grandparent of name:"+name);
	System.out.println("grandparent of surname:"+surname);
}
}
class Parent extends GrandParent{
String name="seshu";
void parentinfo() {
	System.out.println("-----------Parent details-----------");
	System.out.println("parent of name:"+name);
	System.out.println("parent of surname:"+surname);
}
}
class Child extends Parent{
	String name="satish";
	void childinfo() {
		System.out.println("------------Child details-----------");
		System.out.println("child of name:"+name);
		System.out.println("child of surname:"+surname);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
	Child c=new Child ();
	c.grandparentinfo();
	c.parentinfo();
	c.childinfo();

	}

}

