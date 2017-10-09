package com.zooper.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 产品服务接口
 * @author Administrator
 *
 */
public interface Product extends Remote{
	/**
	 * 获取产品描述
	 * @return
	 * @throws RemoteException
	 */
	public String getDescription()throws RemoteException;
}
 