package java_20200515;
//Customer class
public class Customer {
	
	//클래스의 멤버 변수- instance 변수, static 변수, final 변수
	//instance 변수(name, email, phone, balance, isRelased)
	//객체가 생성될 때만 만들어지는 변수
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;	//탈퇴한 회원인가
	
	//이자율(모든 사람 동일)-> static 변수 사용
	public static double interestRate;	
	
	//final변수(상수)는 한번 정해지면 바꿀수 없으므로 일반적으로 static final로 사용한다.
	//상수는 대문자로 쓰는것이 관례
	public static final String BANKNAME ="신한은행";	
	
}