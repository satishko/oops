package singlelevel;
class Animal{
	public void eat() {
		System.out.println("animal eats");
	}
}
class Dog extends Animal{
	public void barks() {
		System.out.println("Dog barks");
	}
}
public class Forest {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.barks();
		
	}

}
