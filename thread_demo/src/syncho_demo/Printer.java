package syncho_demo;

public class Printer {

	public synchronized static void printPages(Page page) {
		System.out.print(page.getPage1());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("  "+page.getPage2());
	}
}