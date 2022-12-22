package Shape;

public class ShapeMain {

	public static void main(String[] args) {
		
			//Instantiating and calling parameterized constructor of square....
			Square s=new Square(8);
			//Instantiating and calling parameterized constructor of Rectangle...
			Rectangle r=new Rectangle (5,8);
			
			//Printing and calling the area...
			System.out.println("Area of Square is:"+s.area());
			System.out.println("Area Of rectange is"+r.area());

		}
	}


