package conditional_statements;

public class WhileDemo {
	
	public void printNum() {
		
		int j = 1;
		while(j <= 10) {
			System.out.println(j);
			j++;
		}
	}
	
	public void sumNaturalNo(){
		
		int n = 50;
		int i = 0;
		int sum = 0;
		
		while(i<=n){
			 sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public void reverseDigits(){
		
		int num = 123;
		int rev = 0;
		
		while(num != 0){
			rev = rev * 10 + (num % 10);
			num /= 10;
			
		}
		System.out.println(rev);
	}

	public void factorial(int i){
		
		int fact = 1;
		while(i > 0){
			
			fact *= i;
			i--;
		}
		System.out.println(fact);
	}

	public void fibonacci(int num){
		
		int a = 0;
		int b = 1;
		int result = 0;
		
		while(num > 0) {
			result = a + b;
			a = b;
			b = result;
			System.out.println(result);
			num--;
			
		}
		
	}
	
	public void countDigit(int num){
		int count = 0;
		while(num != 0){
			num /= 10;
			count++;
		}
		System.out.println(count);
	}

	public void sumOfDigits(int num){
		
		int sum = 0;
		while(num != 0){
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
	
	public void palindrome(String name) {
		
		String rev = "";
		int len = name.length() - 1;
		
		while(len >= 0) {
			
			rev += name.charAt(len);
			len--;
		}
		
		System.out.println("The original string is "+name);
		System.out.println("The reverse string is "+rev);
		
		if(rev.equals(name)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

	public void table(int num) {
		int i = 1;
		while(i <= 10) {
			
			System.out.println(num + " * " + i + " = " + num*i);
			i++;
		}
	}
}
