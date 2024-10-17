package datatypes;

public class IntegerDemo {
	
	//Method Check if Even or not
	public void CheckEven(int a) {
		if(a%2==0){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		
		//Declaring int variable
		int count = 10;
		count = 20;
		System.out.println(count);
		
		//division
		int a,b,result;
		a= 15;
		b =4;
		result= a/b;
		System.out.println(result);
		
		//modulus
		int remainder;
		remainder = a%b;
		System.out.println(remainder);
		
		//if greater or not
		int x,y;
		x = 60;
		y = 50;
		if(x>y){
			System.out.println("x is greater");
		}
		else{
			System.out.println("x is not greater");
		}
	
		//increment by 1
		int blah = Integer.MAX_VALUE;
		System.out.println(blah);
		blah += 1;
		System.out.println(blah);
		
		//increment the counter with for loop
		int counter= 0;
		for(int i = 1; i<=10;i++) {
			counter ++;
			System.out.println(counter);
		}
		
		//type casting of double -> integer
		double decimalVlue = 5.75;
		int integerVlue = (int) decimalVlue;
		System.out.println(integerVlue);
		
		//Accessing the method 
		IntegerDemo inti = new IntegerDemo();
		inti.CheckEven(a);
		
		//<-------------------------using integer methods------------------------->
		
		//value of -> given integer
		int m= Integer.valueOf(x);
		System.out.println("valueOf(x) : "+m);
		
		//value of -> given character (gives ASCII value of a )
		int sl = Integer.valueOf('a');
		System.out.println("valueOf('a') : "+sl);
		
		// Gives Maximum value that can be stored in int
		System.out.println(Integer.MAX_VALUE);
		
		// Gives Minimum that can be stored in int
		System.out.println(Integer.MIN_VALUE);
		
		// Gives Size of integer in Bits
		System.out.println(Integer.SIZE);
		
		// Gives Size of integer in Bytes
		System.out.println(Integer.BYTES);
		
		// Comparison btw two no.
		// returns 1 if first no. is greater than second
		// returns 0 if number are equal
		// returns -1 if second no. is greater
		System.out.println(Integer.compare(x, y));
		
		// converts string to int
		System.out.println(Integer.parseInt("15"));
		
	}

}
