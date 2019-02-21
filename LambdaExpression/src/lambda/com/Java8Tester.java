package lambda.com;

public class Java8Tester {
	
	public static void main(String args[]) {
		Expressions add = ( x,y) -> x + y; 
		Expressions multiply = ( x, y)-> x * y; 
		Expressions substract = ( x, y) -> x -y; 
		Expressions  divide =( x,  y)-> x / y; 
		//add.work(76, 86);
		System.out.println(add.work(76, 86));
		System.out.println(substract.work(76, 86));
		System.out.println(multiply.work(76, 86));
		System.out.println(divide.work(76, 86));
	
		
	
}
	
	
	
}