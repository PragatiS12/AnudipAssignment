import java.util.Scanner;
public class operations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        while(true)
        {
            //Input both numbers that to be performed
        	
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            System.out.println("Choose the operation you want to perform ");
            
            int n = s.nextInt();
            //Choose 1-6 as per your requirement
            switch(n)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Result : x+y= "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : x-y= "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : x*y= "+mul);
                break;
 
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : x/y= "+div);
                break;
 
                case 5:
                int mod;               
                mod = x % y;
                System.out.println("Result : x%y= "+mod);
                break;
 
                case 6:
                System.exit(0);
            }
        }
		
	}

}
