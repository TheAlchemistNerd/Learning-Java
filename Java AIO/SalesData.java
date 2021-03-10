import java.text.NumberFormat;

public class SalesData
{
	static NumberFormat cf = 
		NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args)
	{
		double [][] sales = 
			{ {23853.0, 22838.0, 36483.0, 31352.0},
			  {25483.0, 22943.0, 38274.0, 33294.0},
			  {24872.0, 23049.0, 39002.0, 36888.0},
			  {28492.0, 23784.0, 42374.0, 39573.0},
			  {31932.0, 23732.0, 42943.0, 41734.0} };
		


		System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
		
		int year = 2004;
		
		for (int y = 0; y < 5; y++)
		{
			System.out.print(year + "\t");
			for (int region = 0; region < 4; region++)
			{
				System.out.print(cf.format(sales[y][region]));
				System.out.print("\t");
			}
			year++;
			System.out.println();
		}
	}
}