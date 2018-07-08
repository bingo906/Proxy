package com.bingo.proxy;

public class ProxySubject implements Subject{
	private RealSubject realSubject;
	//调用次数统计
	private  int count = 1;
	@Override
	public void sailBook() {
		count();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.sailBook();
		System.out.println("======调用次数"+(count++));
		status();
	}
	
	public void count(){
		System.out.println("该书打8折");
	}
	
	public void status(){
		System.out.println("该书已出售！");
	}
}
