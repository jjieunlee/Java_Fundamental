package java_20200521;

/*
 * mA()
 * mB()
 * mC()
 * 3.14
 */
public class ImplementClassDemo {
	public static void main(String[] args) {
		InterA i = new ImplementClass();
		i.mA();
		i.mB();
		i.mC();
		
		//interface에 잇는 변수는 final 변수이기 때문에 변경불가 
		//InterA.PI= 3.15
		System.out.println(InterA.PI);
	}
}
