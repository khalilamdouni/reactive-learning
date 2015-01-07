package com.euranova.kmeans.skmeans.checking;

import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

public class RXHelloWorld {

	
	public static void hello(String... names) {
		
		
		Scheduler sch = Schedulers.newThread();
	    Observable.from(names).subscribeOn(Schedulers.immediate()).observeOn(sch).subscribe(s ->
	            {System.out.println("Hello " + s + "!");
	             try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
	      );
	}
	
	public static void main(String[] args) {
		hello("khalil", "nidhal", "mohamed");
		System.out.println("before ending reactive staff");
	}

}
