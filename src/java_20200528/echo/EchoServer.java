package java_20200528.echo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		// 1. ServerSocket 객체를 생성한다.
		try {
			serverSocket = new ServerSocket(port);
			while (true) {
				System.out.println("클라이언트 접속을 기다리고 있습니다. ");
				// accept() : 클라이언트 접속을 기다리고 있음 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket 객체를 생성해 줌.
				Socket socket = serverSocket.accept();
				InetAddress i = socket.getInetAddress();
				String ip=i.getHostAddress();
				System.out.printf("클라이언트가 접속했습니다[%s]\n",ip);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EchoServer(3000).run();
	}
}
