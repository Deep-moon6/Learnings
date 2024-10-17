package datatypes;

public class BooleanDemo {
	
	static boolean isYummy(int rating) {
		
		boolean yesOrno =false;
		if(rating>0 && rating <6) {
			if(rating >3){
				yesOrno = true;
			}else {
				yesOrno = false;
			}
		}
		else {
			System.out.println("Please give rating from 1-5 stars only.");	
		}
		return yesOrno;
	
	}

	public static void main(String[] args) {
		System.out.println(isYummy(15));
	}

}
