package com.test.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test  implements Runnable{
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i =0;i<10;i++) {
			es.submit(new Test());
			
		}
		
		
	}
	
@Override
public void run() {
	 List<String> list = new ArrayList<String>();
	 for(int i =0;i<10;i++) {
		 list.add("1");
	 }
	
	 System.out.println("thread name :" +Thread.currentThread().getName()+",: "+list.hashCode() +",list size:  "+list.size());
	
}
}
