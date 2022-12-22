package Shape;

//rectangle class is inherited from square
public class Rectangle extends Square{
	//Declaring Width...
		int width;
		
		//Parameterized constructor of Rectangle class....
		public Rectangle(int length,int width) {
			
			//Using super keyword calling the length variable which is declare in parent class(square)..
			super(length);
			this.width=width;
			}
		
		//Overriding the area method....
		public int area() {
			int ans;
			ans=length*width;
			return ans;
		}

}
