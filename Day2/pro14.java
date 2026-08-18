package day2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class pro14 extends Abc{

	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	pro14   v = new pro14();
	v.depo();
	v.with();
}
}
