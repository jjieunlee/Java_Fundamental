package java_20200528.echo.client;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		try {
			// 3. Socket 객체를 생성하여 서버와 연결을 시도한다.
			socket = new Socket(ip, port);
			System.out.println("서버와 연결 성공");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.4", 3000).run();
	}
}
