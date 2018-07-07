package com.bingo.proxy;

public class RealSubject implements Subject{

	@Override
	public void sailBook() {
		System.out.println("sail books in RealSubject!");
	}
	
}
