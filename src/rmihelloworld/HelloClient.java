package rmihelloworld;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {

	public static void main(String[] args) {
		try {
			IHello rHello = (IHello)Naming.lookup("rmi://localhost:8887/RHello");
			System.out.println(rHello.helloWorld());
			System.out.println(rHello.sayHelloToSomebody("the world"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
