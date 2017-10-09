package com.zooper.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ProductImpl extends UnicastRemoteObject implements Product{
	private String descr;
	
	public ProductImpl(String descr) throws RemoteException{
		this.descr = descr;
	}

	@Override
	public String getDescription() throws RemoteException {
		return "i am a " + descr + ", buy me";
	}
	
	
}
