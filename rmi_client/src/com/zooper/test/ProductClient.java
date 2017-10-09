package com.zooper.test;

import java.rmi.Naming;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;

import com.zooper.rmi.Product;

/**
 * 调用远程rmi接口
 * @author Administrator
 *
 */
public class ProductClient {
	public static void main(String[] args) throws Exception{
		
		/*
		 * 获取注册成功的服务列表
		 * 方式一
		 */
		String[] servers = Naming.list("rmi://localhost:8888/");
		for (String name : servers) {
			System.out.println(name);
		}
		
		/*
		 * 获取注册成功的服务列表
		 * 方式二
		 */
		Context namingContext = new InitialContext();
		NamingEnumeration<NameClassPair> e = namingContext.list("rmi://localhost:8888/");
		while(e.hasMore()){
			System.out.println(e.next().getName());
		}
		
		/*
		 * 请求接口
		 */
		Product p1 = (Product) Naming.lookup("rmi://localhost:8888/toaster");
		System.out.println(p1.getDescription());
		
		Product p2 = (Product) Naming.lookup("rmi://localhost:8888/Microware");
		System.out.println(p2.getDescription());
	}
}
