package com.bingo.proxy3test;

public class RealSubject implements Subject {

	@Override
	public void method1() {
		System.out.println("������Է���1");
	}

	@Override
	public void method2() {
		System.out.println("������Է���2");
	}
	
}
