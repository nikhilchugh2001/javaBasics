package org.universal.javaprogramming.interviewQA;

public class MultiThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThread MultiThread1 = new MultiThread();
		
		Thread thread1 = new Thread(MultiThread1);
		
		MyThread thread2 = new MyThread();
		
		thread1.start();
		thread2.start();
		
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0; i<= 10;i++) {
			System.out.println("Thread 1 Runing" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}



class MyThread extends Thread
{
	@Override
	public void run() {
		
		for(int i =10; i>=0;i--) {
			System.out.println("Thread 2 Runing" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
