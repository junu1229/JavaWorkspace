package com.kh.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ChattClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.51",60000);
			System.out.println("서버와 연결되었습니다.");
			Thread sendThread = new sendThread(socket);
			sendThread.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(br!=null) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("서버와 연결이 끊어졌습니다.");
		}

	}

}

class sendThread extends Thread {
	
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public sendThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			PrintStream ps = new PrintStream(socket.getOutputStream());
			while(true) {
				ps.println(sc.nextLine());
				ps.flush();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

