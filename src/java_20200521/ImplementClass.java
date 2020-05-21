package java_20200521;

//InterA에는 추상메소드가 3개
public class ImplementClass implements InterA {
	
	// 접근한정자는 default가 될수 없음(interfaced에서 메서드가 public으로 지정되어 있음)
	@Override
	public void mA() {
		// TODO Auto-generated method stub
		System.out.println("mA()");
	}

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("mB()");
	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("mC()");
	}
}
