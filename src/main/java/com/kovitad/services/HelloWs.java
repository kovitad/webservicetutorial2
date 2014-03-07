package com.kovitad.services;

public class HelloWs {
	public String sayHello(final String name) {
		if (null == name) {
			return "Hello";
		}
		return "Hello, " + name + "!";
	}
}
