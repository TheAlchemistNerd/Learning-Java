public class Test2 {
	public void pupAge() { // a method
		/* A local variable declared inside a method
		 * should be declared and assigned an initial value 
		 * before first use */
		try {
			int age; // This will raise an error
			age = age + 7;
		}


		System.out.println("Puppy age is : " + age);
	}
	
	public static void main(String args[]) {
		Test2 test = new Test2();
		test.pupAge();
	}
}