package com.koreait.project0827.thread;

/*
 * 실행중인 프로그램을 일반적으로 프로세스라 한다..
 * 그리고 우리가 자바프로그램을 가동하면 이 또한 하나의 프로세스가 된다..
 * 하지만, 이 자바 프로그램(프로세스)에서 동시에 실행되는 여러 기능을 구현하려면 어떻게 해야 할까? 
 * 자바언어에서는 하나의 프로세스 내에서 독립적으로 실행될 수 있는 또 하나의 세부실행단위를 지원하는데 
 * 이를 가리켜 쓰레드라 한다..그리고, OS가 프로세스들을 관리하면 동시에 프로세스를 제어해주듯이, 
 * 자바에서는 생서된 쓰레드들을 JVM(일종의 소형 OS)에 맡겨야 동시 실행이 가능하게 된다..
 * 즉, 쓰레드를 만들어 시스템한테 맡겨야 한다!!
 * 참고 쓰레드는 쓰레드 클래스를 이용하며 된다.. 
 * */
public class CounterThread {
	
	public static void main(String[] args) {
		//실행속도를 제어하기 위해서, 별도의 세부 실행단위인 쓰레드를 만들어 실행해보자 
		MyThread myThread =new MyThread("★");
		MyThread myThread2 =new MyThread("☆");
		
		myThread.start();// jvm에게 맡기는 시점
		myThread2.start();//Runnable

		
	}
}








