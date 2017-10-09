package com.zooper.test;

import java.rmi.Naming;


import java.rmi.registry.LocateRegistry;

import com.zooper.rmi.ProductImpl;

public class ProductServer {
	public static void main(String[] args) throws Exception {
		ProductImpl p1 = new ProductImpl("blackwell toaster");
		ProductImpl p2 = new ProductImpl("zapXpress Microware Oven");
		
		LocateRegistry.createRegistry(8888);
		//发布服务
		Naming.bind("rmi://localhost:8888/toaster",p1); 
		Naming.bind("rmi://localhost:8888/Microware",p2); 
		
		System.out.println("rmi服务发布成功!");
	}
}
