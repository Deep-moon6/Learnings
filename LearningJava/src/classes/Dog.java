package classes;

public class Dog {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.makeSound();
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		v1.color = "Matte Black";
		v2.horn();
		System.out.println(v1.color);
		System.out.println(v2.color);
	}

}
