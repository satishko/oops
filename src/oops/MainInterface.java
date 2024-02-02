package oops;
interface Mahindracar{
void acceleration();
void brake();
void gear();
void tyres();
void comforts();
void elevation();
void glass();
}
abstract class Senior implements Mahindracar{
	public void acceleration() {
		System.out.println("Mahindra accelerate=120kmph");
	}
public void comforts() {
	System.out.println("Comforts: large space");
}
public void elevation() {
	System.out.println("Elevation: According to mahindra standards");
}
}

class Junior extends Senior{
	public void brake() {
		System.out.println("Brake: Anti lock bracking system");
	}
	public void tyres() {
	System.out.println("Tyres: MRF tyres");	
	}
	public void gear() {
		System.out.println("Gear: 6 gears");
	}
		public void glass() {
			System.out.println("Glass: bulletproof glass");
		}	
		}

public class MainInterface {

	public static void main(String[] args) {
		Senior s1,s2,s3,s4,s5,s6,s7;
		s1=new Junior();s1.acceleration();
		s2=new Junior();s2.comforts();
		s3=new Junior();s3.elevation();
		s4=new Junior();s4.brake();
		s5=new Junior();s5.tyres();
		s6=new Junior();s6.gear();
		s7=new Junior();s7.glass();

	}
		
}

