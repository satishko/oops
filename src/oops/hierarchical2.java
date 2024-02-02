package oops;
class SupParent{
	String carcompanyname="honda";
	String carcolour="white";
	int carprice=150000;
	int carregyear=2024;
	void parentinfo() {
		System.out.println("----------honda car details-----------");
		System.out.println("Name Of Carcompany:"+"honda");
		System.out.println("Carcolour:"+"white");
		System.out.println("Carprice:"+150000);
		System.out.println("carregyear:"+2024);
	}
}
class Child1 extends SupParent{
	String carcompanyname="tata";
	void child1info() {
		System.out.println("----------tata car details-----------");
		System.out.println("Name Of Carcompany:"+"tata");
		System.out.println("Carcolour:"+"white");
		System.out.println("Carprice:"+150000);
		System.out.println("carregyear:"+2024);
	}
}
class child2 extends SupParent{
	String carcompanyname="maruti";
	void child2info() {
		System.out.println("----------maruti car details-----------");
		System.out.println("Name Of Carcompany:"+"maruti");
		System.out.println("Carcolour:"+"white");
		System.out.println("Carprice:"+150000);
		System.out.println("carregyear:"+2024);
	}
}
public class hierarchical2 {

	public static void main(String[] args) {
		Child1 obj1=new Child1();
		child2 obj2=new child2();
		obj1.parentinfo();
		obj2.parentinfo();
		obj1.child1info();
		obj2.child2info();

	}

}
