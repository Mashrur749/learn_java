package com.newthinktank;

import java.util.*;

public class MyThread  implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public MyThread(String x) {
		name = x;
		time = r.nextInt(999);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.printf("%s us sleeping for %d", name, time);
			Thread.sleep(time);
			System.out.println(name + "is done");
		}catch(Exception e) {
			
		}
	}
	
}