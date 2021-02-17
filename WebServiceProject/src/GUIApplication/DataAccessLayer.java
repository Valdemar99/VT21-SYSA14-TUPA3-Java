package GUIApplication;

import java.rmi.RemoteException;

import org.tempuri.WebService1SoapProxy;

public class DataAccessLayer {
	public String readFile(String fileName) throws RemoteException {
		WebService1SoapProxy proxy = new WebService1SoapProxy();
		return proxy.readPath(fileName);
	}
}
