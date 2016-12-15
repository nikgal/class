package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocketAddress("192.168.0.101", 8080));
		Socket client = server.accept();
		System.out.println(client.getInetAddress().getHostAddress());
		client.close();
	}

}
