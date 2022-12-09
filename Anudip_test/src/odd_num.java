
public class odd_num {
	//method to print odd_num
	public static void isodd() {
		int i,num;
		for(i=1;i<=20;i++)
		{
			//checking whether num is odd or not
			if((i%2)!=0) {
				num = i;
				System.out.println(num);
			}
	   }
	
	}
	    public static void main(String[] args) {
		
		
		System.out.println("Odd numbers are:");
		//method calling
		isodd();
		
				
			}

}
