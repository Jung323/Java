package inheritance;

class Animal{
	String name;
	
	public void sound() {
		System.out.println(name+"이 소리를 내다");
	}
}

class Dog extends Animal{

}


class Cat extends Animal{

}





public class C01inheritancemethode {
	public static void main(String[] args) {
		Dog puppy = new Dog();
		Cat yummi = new Cat();
		
		puppy.name = "멍멍";
		yummi.name = "애옹";
		
		puppy.sound();
		yummi.sound();
	}
}
