package program3;

public class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private Address address; //Aggregation or has-a relationship
	private int salary;
	
	//parameterized constructor
	public Member(String name,int age,String phoneNumber,Address address,int salary) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	
	//method to print 
	public void print() {
		System.out.println("Name: "+name );
		System.out.println("age: "+age );
		System.out.println("Phone Number: "+phoneNumber );
		System.out.println("Address: "+address );
		System.out.println("Salary of the members are: " +salary);
	}
	 
	
	 

}
