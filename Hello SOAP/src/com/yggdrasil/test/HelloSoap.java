package com.yggdrasil.test;

import javax.jws.WebService;

@WebService
public class HelloSoap {
	public String hello(String name) {
		return("Hello, " + name + "!");
	}
	
	public String echo(String word) {
		return(word);
	}
}
