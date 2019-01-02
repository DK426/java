package karpov.daniel;

public class MyFirstProgram
{
	public static void main(String[] args)
	{
		String smb = "Pedro";
		hello(smb);

		Square s = new Square(4);
		Rectangle r = new Rectangle(4,5);

		System.out.println(s.area());
		System.out.println(r.area());
	}

	public static void hello(String smb)
	{
		System.out.println("Hey " + smb + "\nHELLO MAFAKA!11111");
	}




}