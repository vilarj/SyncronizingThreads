package classes;

public class Driver {

	public static void main(String[] args) {
		// Creating the objects of type Thread
		Thread1 trd1 = new Thread1();
		Thread2 trd2 = new Thread2();
		Thread3 trd3 = new Thread3();
		Thread4 trd4 = new Thread4();
		Thread5 trd5 = new Thread5();
		Thread6 trd6 = new Thread6();
		
		// Running the objects and controlling their behaviors 
		// -> who runs first and who follows the previous one
		trd1.start();
		try {
			trd1.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread1 " + ex);
		}
		
		trd2.start();
		try {
			trd2.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread2 " + ex);
		}
		
		trd3.start();
		try {
			trd3.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread3 " + ex);
		}
		
		trd4.start();
		try {
			trd4.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread4 " + ex);
		}
		
		trd5.start();
		try {
			trd5.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread5 " + ex);
		}
		
		trd6.start();
		try {
			trd6.sleep(1000);
		}
		
		catch(InterruptedException ex) {
			System.out.println("Error with the Thread6 " + ex);
		}
		
	}
}
