package classes;

public class Thread3 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.print("l");
		}
		// Controlling the behavior of the Thread
		try {
			Thread1.sleep(10);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error in the class Thread3.java " + ex);
		}
	}

}
