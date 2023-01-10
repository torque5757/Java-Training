package abstractioneg;

public class Abstractclass1 extends Abstractclass 
{
	public void print()
	{
		System.out.println("Abstract method");
	}
	public static void main(String[] args) 
	{
		Abstractclass1 ob = new Abstractclass1();
		ob.print();
		ob.display();
		

	}

}
