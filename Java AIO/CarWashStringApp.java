import java.util.Scanner;

public class CarWashStringApp
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println
			("The car wash application!\n\n");
		System.out.print("Enter the package code: ");
		String s = sc.next();
		char p = s.charAt(0);
		
		String details = "";
		
		switch (s.toUpperCase())
		{
		case "PRESIDENTIAL":
			details += "\tNew Car Scent, plus ... \n";
		case "ELITE":
			details += "\tTire Treatment, plus ... \n";
		case "DELUXE":
			details += "\tLeather/Vinyl Treatment, plus ... \n";
		case "SUPER":
			details += "\tWax, plus ... \n";
		case "STANDARD":
			details += "\tWash, vacuum, and hand dry.\n";
			break;
		default:
			details = "That's not one of the codes.";
			break;
		}
		System.out.println("\n that package includes:\n");
		System.out.println(details);
	}
}
					
