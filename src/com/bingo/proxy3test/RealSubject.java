package com.bingo.proxy3test;

public class RealSubject implements Subject {

	@Override
	public void method1() {
		System.out.println("代理测试方法1");
	}

	@Override
	public void method2() {
		System.out.println("代理测试方法2");
	}
	
}
