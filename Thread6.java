package classes;

public class Thread6 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 1; i++) {
			System.out.print("j");
		}
		// Controlling the behavior of the Thread
		try {
			Thread1.sleep(10);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error in the class Thread6.java " + ex);
		}
	}
}
