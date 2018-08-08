package program;

import java.util.Scanner;

public class Name 
{

	public static void main(String[] args)
	{
		String n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		n=s.next();
		if(n.equals("surya"))
			System.out.println("helo!,how are you");
		else
			System.out.println("who are you");
	}
	

}
