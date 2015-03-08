package com.yggdrasil.test;

import javax.jws.WebService;

@WebService
public class HelloSoap {
	public String Hello(String name) {
		return("Hello, " + name + "!");
	}
}
