package extending_thread_demo;

public class DemoMain {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setPriority(6);
		t.setName("my-main");
		System.out.println(Thread.currentThread());
		
		MyThread m1=new MyThread();
		m1.setName("my-1");
		
		MyThread m2=new MyThread();
		m2.setName("my-2");

		MyThread m3=new MyThread();
		m3.setName("my-3");

		MyThread m4=new MyThread();
		m4.setName("my-4");
		m4.setPriority(8);
		
		m4.start();
		m1.start();
		m2.start();
		m3.start();
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