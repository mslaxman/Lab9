package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E1 {

	public static void main(String[] args) {
		Runnable r=()->{System.out.println(Thread.currentThread().getName());};
		
		//Single Thread Executor
		ExecutorService ex1=Executors.newSingleThreadExecutor();
		for(int i=0;i<6;i++) {
			ex1.execute(r);
		}
		
		//Fixed Thread Pool
		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<6;i++) {
			ex.execute(r);
		}
		
		//Cashed Thread Pool
		ExecutorService ex2=Executors.newCachedThreadPool();
		for(int i=0;i<6;i++) {
			ex2.execute(r);
		}

	}

}
