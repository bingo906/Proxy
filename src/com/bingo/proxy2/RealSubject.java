package com.bingo.proxy2;

public class RealSubject implements Subject{

	@Override
	public void sailBook() {
		System.out.println("sail books in RealSubject!");
	}

	@Override
	public void reSailBook() {
		System.out.println("resail books in RealSubject!");

	}
	
}
