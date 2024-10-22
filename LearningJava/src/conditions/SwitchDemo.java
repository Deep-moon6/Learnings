package conditions;

public class SwitchDemo {

	void weekDay(int num){
		
		switch (num){
		
		case 1:
			System.out.println("Monday");
			break;
		
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
		
		case 5:
			System.out.println("Friday");
			break;
		
		case 6:
			System.out.println("Saturday");
			break;
		
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("There's no such day in a week");
		}
	}

	void isVowel(String str){
			
			for(int i = 0; i<str.length();i++){
			 char c = str.charAt(i);
			switch (c) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(c+" is a Vowel");
				break;
				
			default:
				System.out.println(c+" is a Consonant");
			}
		}
		
	}
	
void isVowel(char c){
		
		switch (c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+" is a Vowel");
			break;
			
		default:
			System.out.println(c+" is a Consonant");
		}
	}
	

	
}

