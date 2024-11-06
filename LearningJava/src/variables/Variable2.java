package variables;

public class Variable2 {
	
	static double pi = 3.14159;

	public static void main(String[] args) {
		int age = 25;
		System.out.println(age);
		
		boolean isStudent = false;
		System.out.println(isStudent);
		
		int a,b,sum;
		a = 10;
		b = 5;
		sum = a + b;
		System.out.println(sum);
		
		String greeting ="Hello ";
		String name = "World";
		String fullGreeting = greeting + name;
		System.out.println(fullGreeting);
		
		int[]numbers = {1,2,3,4,5};
		System.out.println(numbers);
		
		int counter = 0;
		counter += 1;
		System.out.println(counter);
		
		double price = 19.99;
		int roundedPrice = (int)(price);
		System.out.println(roundedPrice);
		
		String result;
		int score= 0;
		if(score >= 50) { 
			result ="Pass";
		}
		else {
			result = "Fail";
		}
		System.out.println(result);
		
		double area = pi*5*5;
		System.out.println(area);
		
		Eg eg = new Eg();
		System.out.println(eg.solo);;
		eg.callMummy();
	}

}

 class Eg {
	 
	 String solo = "Come back soon";
	 
	 public void callMummy() {
		 
		System.out.println("Hey,Google. Call mummy mobile");
	 }
	 
	
}
