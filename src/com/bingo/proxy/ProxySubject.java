package com.bingo.proxy;

public class ProxySubject implements Subject{
	private RealSubject realSubject;
	//���ô���ͳ��
	private  int count = 1;
	@Override
	public void sailBook() {
		count();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.sailBook();
		System.out.println("======���ô���"+(count++));
		status();
	}
	
	public void count(){
		System.out.println("�����8��");
	}
	
	public void status(){
		System.out.println("�����ѳ��ۣ�");
	}
}
