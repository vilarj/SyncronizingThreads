package classes;

public class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			System.out.print("i");
		}
		// Controlling the behavior of the Thread
		try {
			Thread1.sleep(10);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error in the class Thread2.java " + ex);
		}
	}
}
