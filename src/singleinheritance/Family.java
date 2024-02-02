package singleinheritance;
class Parent{
	String name="swami";
	String surname="Kodavati";
	public void parentinfo() {
		System.out.println("Name Of Parent:"+name);
		System.out.println("Surname Of Parent:"+surname);
	}
}
class Child extends Parent{
	String name="satish";
	public void childinfo() {
     System.out.println("Name Of Child:"+name);
}
}
public class Family {

	public static void main(String[] args) {
	Child c=new Child();
	c.parentinfo();
	c.childinfo();
	}
		

	}


