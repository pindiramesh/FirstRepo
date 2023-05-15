package com.java8;

interface Calculator{
	//void switchon();
	void sum(int input);
}

public class FunctionalInterfPractice {
public static void main(String[] args) {
	//Calculator calculator=()->System.out.println("switch on");
	//calculator.switchon();
	Calculator calculator=(input)->System.out.println("switch on"+input);
	calculator.sum(10);
}
}
