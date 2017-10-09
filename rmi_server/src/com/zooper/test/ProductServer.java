package com.zooper.test;

import java.rmi.Naming;


import java.rmi.registry.LocateRegistry;

import com.zooper.rmi.ProductImpl;

public class ProductServer {
	public static void main(String[] args) throws Exception {
		ProductImpl p1 = new ProductImpl("blackwell toaster");
		ProductImpl p2 = new ProductImpl("zapXpress Microware Oven");
		
		/*
		 * 本地主机上的远程对象注册表Registry的实例，并指定端口为8888，
		 * 这一步必不可少（Java默认端口是1099），必不可缺的一步，
		 * 缺少注册表创建，则无法绑定对象到远程注册表上 
		 */
		LocateRegistry.createRegistry(8888);
		
		//发布服务
		Naming.bind("rmi://localhost:8888/toaster",p1); 
		Naming.bind("rmi://localhost:8888/Microware",p2); 
		
		System.out.println("rmi服务发布成功!");
	}
}
