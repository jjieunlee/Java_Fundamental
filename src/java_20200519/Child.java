package java_20200519;

public class Child extends Parent {
	String chicken;

	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}

	@Override
	public void play(String star) {
		//super.play(star);
		System.out.println("Child play()");
	}

	public void setParentMoney(int money) {
		super.money = money;
	}

	public int getParentMoney() {
		return super.money;
	}
}
