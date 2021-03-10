public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// here's our main method
	public static void main(String[] args) {
		Person person = new Person("Neville Maloba");
		System.out.println(person.getName());
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) {
		if(name!=null && name.length()>2)
			this.name = name;
		
	/*
	public String getName(){
		if(name.length()>16)
			return "Name is too large!";
		else
			return name;
	}
	*/
	}
}
	
	