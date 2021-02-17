package test;
import java.rmi.RemoteException;
import java.util.Scanner;

import org.tempuri.WebService1SoapProxy;

public class TestClass {
	public static void main(String args[]) {
		WebService1SoapProxy proxy = new WebService1SoapProxy();
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a filename:");
		String fileName = inputScanner.nextLine();
		
		try {
			String s = proxy.readPath(fileName);
			System.out.println(s);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("Error.");
			e.printStackTrace();
		}
		
		
	}
}
