package rmihelloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {

	public String helloWorld() throws RemoteException; 
	
	public String sayHelloToSomebody(String somebodyName) throws RemoteException;
}
