package com.bingo.proxy;

public class MainTest {
	public static void main(String[] args) {
		ProxySubject proxySubject = new ProxySubject();
		for(int i=0;i<3;i++){			
			proxySubject.sailBook();
		}
		
		
		ProxySubject proxySubject1 = new ProxySubject();
		for(int i=0;i<3;i++){			
			proxySubject1.sailBook();
		}
	}
}
