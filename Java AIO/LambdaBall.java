public class LammbdaBall
{
	public static void main(String[] args)
	{
		Ball b = () -> {System.out.println("You hit it!"); };
		b.hit();
	}
	interface Ball
	{
		void hit();
	}
}