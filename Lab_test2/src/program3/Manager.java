package program3;

public class Manager extends Member{
	private String department;

	//parameterized constructor
	public Manager (String name,int age,String phoneNumber,Address address,int salary,String department) {
		super(name,age,phoneNumber,address,salary);
		this.department=department;
		System.out.println("Department:" +this.department);	
	}

	
}
