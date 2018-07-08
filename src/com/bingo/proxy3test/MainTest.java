package com.bingo.proxy3test;

import java.lang.reflect.Proxy;

public class MainTest {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		MyHandler myHandler = new MyHandler();
		myHandler.setRealSubject(realSubject);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),myHandler);
		proxySubject.method1();
		proxySubject.method2();
		
	}
}
