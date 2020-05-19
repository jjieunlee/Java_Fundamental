package java_20200519;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 100_000_000;
		p.makeMoney();
		p.play("baduk");

		System.out.println(p.money);

		Child c = new Child();
		c.setParentMoney(1234567);
		c.chicken = "교촌통닭";
		c.gotoSchool();
		c.makeMoney();
		c.play("omok");

		System.out.println(p.money);
		System.out.println(c.getParentMoney());
		System.out.println(c.chicken);
	}
}