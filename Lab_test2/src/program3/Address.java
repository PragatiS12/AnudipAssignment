package program3;

public class Address {
	int Hno;
	String city;
	String state;
	Address(int Hno,String city, String state) {
		this.Hno=Hno;
		this.city=city;
		this.state=state;
	}
	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", city=" + city + ", state=" + state + "]";
	}
	
	


}
