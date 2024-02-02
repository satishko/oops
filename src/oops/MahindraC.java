package oops;
public interface MahindraC {
void accelerate();
void brake();
void gear();
void tyres();
void comforts();
void elevation();
void glass();
}
abstract class SeniorArchitect implements MahindraC{
	public void accelerate() {
		System.out.println("Mahindra accelerate=120kmph");
	}
public void comforts() {
	System.out.println("Comforts: large space");
}
public void elevation() {
	System.out.println("Elevation: According to mahindra standards");
}
}
 class JuniorArchitect extends SeniorArchitect{
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
			
public class MahindraC {
	public static void main(String[] args) {
		SeniorArchitect s1,s2,s3,s4,s5,s6,s7;
		s1=new JuniorArchitect();s1.accelerate();
		s2=new JuniorArchitect();s2.comforts();
		s3=new JuniorArchitect();s3.elevation();
		s4=new JuniorArchitect();s4.brake();
		s5=new JuniorArchitect();s5.tyres();
		s6=new JuniorArchitect();s6.gear();
		s7=new JuniorArchitect();s7.glass();
}
}
 }
