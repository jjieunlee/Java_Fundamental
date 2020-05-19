package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		
		//Math class -> all static
		//Math m = new Math();
		
		Admin a = new Admin("jk04115", "123456", "jk04115@naver.com", 1);

		Admin b = new Admin();
		// a.setId("jk04115");
		// a.setPwd("123456");
		// a.setEmail("jk04115@naver.com");
		// a.setLevel(7);

		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		//overloading
		Admin a1=new Admin("jk00111","589012","test@test.com");
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());//0
		
	}
}
