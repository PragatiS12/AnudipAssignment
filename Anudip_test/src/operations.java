import java.util.Scanner;
//public class operations {

	public static void main(String[] args) {
		package labtest1;
		import java.util.Scanner;  

		public class operations {
//			Method for performing operations
			public static void operation(char n,int a,int b){
				switch(n) {
				case '+': System.out.println("Addition is:"+a+b);
							break;
//				case '-': System.out.println("substraction is"+ a - b);
//							break;
				case '*': System.out.println("Multiplication is:"+a*b);
							break;
				case '/': System.out.println("Division is:"+a/b);
							break;
				case '%': System.out.println("Reminder is:"+a%b);
							break;
				default: System.out.println("Please choose valid operations");
							break;
				}
					
				
				
			}
			public static void main(String[] args) {
				// Taking input from users
				Scanner sc=new Scanner(System.in);  
				System.out.print("Enter operation like *,%,/,+,- :");  
				char n = sc.next().charAt(0);
				System.out.print("Enter first number- ");  
				int a= sc.nextInt();  
				System.out.print("Enter second number- ");  
				int b= sc.nextInt();  
				
//				calling the method operation
				operation(n,a,b);
				
				
	}

}
