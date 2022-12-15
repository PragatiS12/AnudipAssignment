package program3;


public class MemberMain {
	//main function
	public static void main(String[]args) {
		//instantiating
				Address add1=new Address(208,"kanpur","UP");
				Address add2=new Address(203,"nagpur","UP");
				Employee e1=new Employee("Ravi",1,"90983048347",add1,55000,"Programmer");
				Manager m1=new Manager("Rohan",2,"984744748",add2,330000,"HR");
				
				//calling method
				e1.print();
				m1.print();
				
			}
}
