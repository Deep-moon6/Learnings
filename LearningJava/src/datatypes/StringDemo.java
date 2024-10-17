package datatypes;

public class StringDemo {
	
	public char FindCharPosi(String a,int b) {
		
		char cP = a.charAt(b);
		return cP;
		
	}

	public static void main(String[] args) {
		
		//String var is declared and instantiated
		String firstName = "Mix";
		String lastName = "Sahaphap";
		//Concatenation
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		String quote = "To be or not to be";
		System.out.println(quote.length());
		
		String sentence = "Java is fun";
		String word = sentence.substring(0, 3);
		System.out.println(word);
		
		StringDemo sd = new StringDemo();
		System.out.println(sd.FindCharPosi(firstName, 2));
		
		System.out.println(firstName.compareTo(lastName));
		
		int j = 33;
		String str = String.valueOf(j);
		System.out.println(str);
		
		
		
	}

}
