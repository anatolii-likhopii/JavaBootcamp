package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();
		calculator.divide(10,0);


	}
	/// Add
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	public int subtract(int x, int y) {
		int diff = x-y;
		return diff;
	}

	// Multiply
	public int multiply(int x, int y) {
		return x*y;

	}

	// Divide
	public int divide(int x, int y) {
		int divValue = 0;
		try{
			divValue = x/y;
		}catch (ArithmeticException aE){
			System.out.println(aE.getMessage());
		}
		return divValue;

	}
	//TODO create the Calculator (here or in additional class)

}
