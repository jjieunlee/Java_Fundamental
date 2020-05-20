package myPractice;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		d.name="yolo";
		d.age=3;
		d.eat("beef");
		d.sleep();
		System.out.println(d.age);
		d.kindOfDog("ki");
		
		
	}
}
