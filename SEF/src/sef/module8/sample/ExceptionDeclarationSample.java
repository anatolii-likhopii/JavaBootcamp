package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			throw new IllegalArgumentException("Age must be less than 0");
			
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		setAge(-5);
		setAge(0);
		setAge(10);
	}
}
