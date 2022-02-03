import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	    
	public static void main(String[] args) throws IOException {
		int numberOfPackages = 0;
		String packageDescription;
		double weight = 0;
		String zone;
		Package sendPackage = null;
		List<Package> packageList = new ArrayList<Package>();
		ISender student = new Student(10);
		ISender senior = new Seniors(15);
		String sender;
		putText("\nEnter number of packages: ");
		numberOfPackages = getInt();
		for (int i = 0; i < numberOfPackages; i++) {
			putText("\nPackage Description: ");
			packageDescription = getString();
			putText("\nPackage Weight: ");
			weight = getDouble();
			putText("\nDestination Zone: ");
			zone = getString();
			putText("\nSender: ");
			putText("\nEnter: Student or Senior");
			sender = getString();
			sendPackage = new Package(packageDescription, weight, zone);
			switch(sender.toLowerCase()) {
				case "student":
					sendPackage.setSender(student);			
					break;
				case "senior":
					sendPackage.setSender(senior);
					break;
			}
			packageList.add(sendPackage);
		}
		for(Package package1 : packageList) {
			package1.addCarrier(new UPS(package1.getWeight()));
			package1.addCarrier(new FedEx(package1.getWeight(), package1.getZone()));
			package1.addCarrier(new USMail(package1.getWeight()));
			package1.setPrice();
			package1.print();
		}       
	}
	
	//writes string s to the screen
    public static void putText(String s) {
        System.out.println(s);
    }

    //reads a string from the keyboard input
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // reads an integers from the keyboard input
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    
    public static double getDouble() throws IOException {
    	String s = getString();
    	return Double.parseDouble(s);
    }

}