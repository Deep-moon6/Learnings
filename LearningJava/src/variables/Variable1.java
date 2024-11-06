package variables;

public class Variable1 {
	//types of variables
	
	int num1; 
	//instance variable - declared inside class but outside method()   instance specific
	
	public static void main(String[] args) {
		
		Variable1 obj = new Variable1();
		int num = 13; //local variable - declared inside method  //cannot be static
		
		obj.num1=12;
		System.out.println(num);

	}
	
	
}
