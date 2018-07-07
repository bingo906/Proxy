package com.bingo.proxy;

public class ProxySubject implements Subject{
	private RealSubject realSubject;
	@Override
	public void sailBook() {
		count();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.sailBook();
		status();
	}
	
	public void count(){
		System.out.println("该书打8折");
	}
	
	public void status(){
		System.out.println("该书已出售！");
	}
}
