package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		//자료형의 범위를 넘어가면 에러 발생
		//형변환을 하면 에러가 발생하지 않고, circuit 발생 (byte: -128~127)
		byte a = (byte)129;	//-127
		System.out.println(a);
		
		//float, double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림(cut)
		int b = (int)23.5f;	//23
		System.out.println(b);
		
		//float, double 값을 byte형으로 캐스팅하면 cut이 먼저 일어나고 그 후 circuit 발생
		byte c = (byte)128.5;
		System.out.println(c);
	}
}