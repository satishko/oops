package oops;
abstract class ArithmeticOpr{
	abstract public void add();
}
class DevArithmeticOpr extends ArithmeticOpr{
	public void add()
	{
System.out.println("add method");
}
}
public class ResultAbstract {

public static void main(String[] args) {
	ArithmeticOpr a1=new DevArithmeticOpr();
	a1.add();
}
}

	


