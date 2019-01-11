package ua.testov.test;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int number=101;

	public FactorialThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	private BigInteger calculateFactorial(int number) throws IllegalArgumentException {
		if(number==101) throw new IllegalArgumentException("none"); 
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	public void run() {
		Thread th = Thread.currentThread();
		try{
		System.out.println(th.getName() + " " + this.number + "!= "
				+ calculateFactorial(this.number));
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}

	}
}