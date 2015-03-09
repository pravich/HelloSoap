package com.yggdrasil.test;

public class Conversation {
	protected String getReply(String name) {
		if(name.equalsIgnoreCase("vich")) {
			return("Dude");
		} else { 
			return(name);
		}
	}
}
