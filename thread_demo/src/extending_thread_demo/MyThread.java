package extending_thread_demo;

public class MyThread extends Thread {

	@Override
	public void run() {
//		System.out.println("Hello from " + Thread.currentThread().getName() + " whose ID is "
//				+ Thread.currentThread().getId() + " and priority is " + Thread.currentThread().getPriority());
		
		for(int i=0;i<4;i++) {
			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}