package oops;
abstract class FoodOrder{
	public abstract void menu();
	public abstract void listRestaurant();
	public abstract void typefood();
	{ 
	}
	}
class Italian extends FoodOrder{
	public void menu() {
		System.out.println("all Italian food items");
	}
		public void listRestaurant() {
			System.out.println("all Restaurants displayed");
		}
			public void typefood() {
				System.out.println("Italian food");
	}
}
	
class Chinese extends FoodOrder{
	public void menu() {
		System.out.println("all Chinese food items");
	}
		public void listRestaurant() {
			System.out.println("all restaurants displayed");
		}
			public void typefood() {
				System.out.println("Chinese food");
}
		}
		abstract class Indian extends FoodOrder{
			public void listRestaurant() {
				System.out.println("all restaurants is displayed");
			}
				public void typefood() {
					System.out.println("indian food");
		}
			}
		
			class Veg extends Indian{
public void menu() {
	System.out.println("list of all vegeteron iteams"+"is displayed");
}
			}
			class NonVeg extends Indian{
				public void menu() {
					System.out.println("list of all nonvegeterion iteams"+"is displayed");
				}
			}
			
public class FoodOrderApp {
 
	public static void main(String[] args) {
		FoodOrder f1,f2,f3,f4;
		System.out.println("*****FoodOrder for Italian*******");
		f1=new Italian();f1.menu();f1.listRestaurant();f1.typefood();
		System.out.println("*****FoodOrder for chinese*******");
		f2=new Chinese();f2.menu();f2.listRestaurant();f2.typefood();
		System.out.println("*****FoodOrder for vegeterian*******");
		f3=new Veg();f3.menu();f3.listRestaurant();f3.typefood();
		System.out.println("*****FoodOrder for vegeterian*******");
		f4=new NonVeg();f4.menu();f4.listRestaurant();f4.typefood();
		System.out.println("*****FoodOrder for vegeterian*******");
	}

}

