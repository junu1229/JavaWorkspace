package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	// 키보드로 입력 받은 데이터를 읽어서 서버로 보낸다.
	// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력

	public static void main(String[] args) {
		
		try {
			
			// 1. 소켓 생성
			Socket s = new Socket("127.0.0.1",60000);
			System.out.println("Client Socket Creating...");
			
			// 2. 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader brs = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			String sendLine="";
			while((sendLine = br.readLine())!=null) {
				pw.println(sendLine);
				System.out.println(brs.readLine());
			}
			
		} catch (IOException e) {
			System.out.println("서버와의 연결에 실패했습니다.");
		}


	}

}
