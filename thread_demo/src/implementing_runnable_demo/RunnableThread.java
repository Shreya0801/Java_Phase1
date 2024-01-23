package implementing_runnable_demo;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
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