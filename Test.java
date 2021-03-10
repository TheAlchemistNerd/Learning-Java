public class Test {
	public void pupAge() { // a method
		/* A local variable declared inside a method
		 * should be declared and assigned an initial value 
		 * before first use */ 
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}
	
	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
	}
}