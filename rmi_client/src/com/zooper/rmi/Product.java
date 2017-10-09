package com.zooper.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 定义远程调用接口
 * @author Administrator
 *
 */
public interface Product extends Remote{
	
	public String getDescription()throws RemoteException;
}
