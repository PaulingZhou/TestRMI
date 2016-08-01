package rmihelloworld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class HelloImpl extends UnicastRemoteObject implements IHello {

	protected HelloImpl() throws RemoteException {
		super();
	}

	@Override
	public String helloWorld() throws RemoteException {
		return "hello world";
	}

	@Override
	public String sayHelloToSomebody(String somebodyName) throws RemoteException {
		return "hello, " + somebodyName;
	}

}
