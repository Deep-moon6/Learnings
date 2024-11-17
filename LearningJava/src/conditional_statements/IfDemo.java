package conditional_statements;

public class IfDemo {
	
	//Method for is +ve ,-ve or zero
	public void IsPositive(int num){
		if(num>0) {
			System.out.println(num+" is Positive.");
		}
		else if (num==0) {
			System.out.println(num+" is Zero.");
		}
		else {
			System.out.println(num+" is Negative.");
		}
	}
	
	//Method for checking leap year
	public void isLeapyear(int year){
		 if(year%4==0){
		System.out.println("Is leap year!!");
		 }
		 else {
			 System.out.println("Oh no :( ,Its not a leap year...");
		 }
	}
	
	//Giving Grades dah..
	public void graderEvaluator(int total){
		
		if(total>=90) {
			System.out.println("A");
		}
		else if(total>=80) {
			System.out.println("B");
		}
		else if(total>=70) {
			System.out.println("C");
		}
		else if(total>=60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}

	//Check if an adult teen or child
	public void adultCheck(int age) {
		
		if(13>age){
			System.out.println("Child");
		}
		else if( 13 <= age && age <=20){
			System.out.println("Teen");
		}
		else {
			System.out.println("Adult");
		}
	}
	
	public void basicIf(String name) {
		if(name =="Deepika") {
			System.out.println("Hello Deepika");
		}
	}

	public void demoIfElse(int num) {
		if(num<10) {
			System.out.println("Num is Less than 10");
		}
		else {
			System.out.println("Num is greater than 10");
		}
	}
	
	public void ifElseLadder(int num) {
		
		if(num > 10){
			System.out.println(num+" is greater than 10");
		}
		else if(num == 10) {
			System.out.println(num+" is equals to 10");
		}
		else {
			System.out.println(num+" is less than 10");
		}
	}

	public void nestedIf(int rating) {
		if(rating<=5){
			if(rating<3){
				System.out.println("Bad");
			}
			else if(rating == 3){
				System.out.println("Okay");
			}
			else {
				System.out.println("Good");
			}
		}
		else {
			System.out.println("Rating should be upto 1 to 5");
		}
	}
}
