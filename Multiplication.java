package jeni;

public class Multiplication extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a * b;
		System.out.println("Multiplication result is:" + c);
	}

}

class Division extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a / b;
		System.out.println("Division  result is:" + c);
	}

}

class Addition extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a + b;
		System.out.println(" Addition result is:" + c);
	}

}

class Subtraction extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a - b;
		System.out.println("Subtraction  result is:" + c);
	}

}
