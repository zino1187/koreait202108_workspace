package com.koreait.project0827.thread;


//나만의 쓰레드 정의 
public class MyThread extends Thread{
	String str;
	
	public MyThread(String str) {
		this.str=str;
	}
	
	//개발자가 제어하고 싶은 로직은 쓰레드의 run()메서드에 작성한다 
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(str);
			
			try {
				Thread.sleep(500);  // 1000분의 500 초 동안 쉰다..
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
