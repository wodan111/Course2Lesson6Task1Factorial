package ua.testov.test; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] x = new Thread[100];
		for (int i = 0; i < x.length; i++) {
			x[i] = new Thread(new FactorialThread(i+1), "Thread-" + (i + 1));
		}

		for (int i = 0; i < x.length; i++) {
			x[i].start();

		}

	}

}
