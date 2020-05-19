package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자(Default Constructor)
	// alt+shift+s = > c
	public Admin() {
		super();// 부모 클래스의 default 생성자를 호출
	}

	// 생성자(Constructor)
	// 생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스 변수 초기화
	// alt+shift+s => o
	public Admin(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	// 생성자의 오버로딩
	public Admin(String id, String pwd, String email) {
		// super();
		// this.id = id;
		// this.pwd = pwd;
		// this.email = email;
		this(id, pwd, email, 0);// 다른 생성자를 호출, 반드시 생성자에서만 호출 가능
		/*
		 * this 용법 2가지 1. 자기자신 객체 => this. 2. 다른 생성자 호출 => this(~,~,,,)
		 */
	}

	//alt+shift+s=>r
	// id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}

	// id에 대한 getter 메서드
	public String getId() {
		return id;
	}

	// pwd에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}

	// pwd에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// email에 대한 getter 메서드
	public String getEmail() {
		return email;
	}

	// email에 대한 setter 메서드
	public void setEmail(String email) {
		this.email = email;
	}

	// level에 대한 getter 메서드
	public int getLevel() {
		return level;
	}

	// level에 대한 setter 메서드
	public void setLevel(int level) {
		this.level = level;
	}
}
