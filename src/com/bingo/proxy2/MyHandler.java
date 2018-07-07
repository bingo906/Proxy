package com.bingo.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		count();
		result = method.invoke(realSubject, args);
		status();
		return result;
	}
	public void count(){
		System.out.println("该书打8折");
	}
	
	public void status(){
		System.out.println("该书已出售！");
	}
}
