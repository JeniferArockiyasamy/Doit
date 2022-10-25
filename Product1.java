package jeni;

public class Product1 extends Thread {
	public void run() {
		Products.beverges();
	}
}

class Product2 extends Thread {
	public void run() {
		Products.Sauce();
	}

}

class Product3 extends Thread {
	public void run() {
		Products.dairy();
	}
}
