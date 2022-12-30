package exceptionhandling;

//class for invalid_mailexception who extend the exception class......
public class InvalidMailIdException extends Exception{
	public InvalidMailIdException(String msg) {
		super(msg);
	}
}