public class RandomNumber
{
	public static void main(String[] args)
	{
		int number = getRandomNumber();
		System.out.println("The number is " + number);
	}
	public static int getRandomNumber()
	{
		int num = (int)(Math.random() * 10) + 1;
		return num;
	}
}
