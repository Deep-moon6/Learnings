package conditional_statements;

public class ForDemo {
	
	public void basicFor(int number){
		 for(int i = 1; i <= number; i++){
			 System.out.println(i);
		 }
	}

	public void iterateArray(){
		int[] nums = {2,4,6,8};
		for(int i = 0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
	public void evenPrint(int i){
		for(int k = 1; k<=i;k++){
			if(k % 2 ==0){
				System.out.println(k);
			}
		}
	}

	public void tablePrints(int n) {
		
		for(int i = 1; i <= 10; i++){
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
	
	public void asterisks(int desirednum){
		for(int i = 1; i<=desirednum; i++){
			String ast = "*";
			System.out.println(ast);
			
		}
	}
}
