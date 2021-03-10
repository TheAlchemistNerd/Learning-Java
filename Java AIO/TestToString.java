public class TestToString
{
	public static void main(String[] args)
	{
		Employee emp = new Employee("Martinez",
			"Anthony");
		System.out.println(emp.toString());
	}
}
class Employee
{
	private String lastName;
	private String firstName;
	public Employee(String lastName, String firstName)
	{
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public String toString()
	{
		return this.getClass().getName() + "["
			+ this.firstName + " "
			+ this.lastName + "]";
	}
}

	