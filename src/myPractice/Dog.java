package myPractice;

public class Dog extends Animal{
	//String name;
	
	public void kindOfDog(String kind) {
		System.out.println(kind);
	}
	@Override
	public void sleep() {
		System.out.println("neaping");
	}
}
