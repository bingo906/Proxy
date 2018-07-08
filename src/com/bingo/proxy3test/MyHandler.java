package com.bingo.proxy3test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		before();
		result = method.invoke(realSubject, args);
		after();
		return result;
	}
	
	public void before() {
		System.out.println("before invoke method");
	}
	public void after() {
		System.out.println("after invoke method");
	}
}
