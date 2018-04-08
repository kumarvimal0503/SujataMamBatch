package com.core.demo.string;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringBufferDemo {
	Logger log = Logger.getLogger("StringBufferDemo");
	
	
	public void main(String[] args) {
		
		StringBuffer strBuf = new StringBuffer();
		
		strBuf
		.append("A")
		.append(" ")
		.append("Bron");
		
		System.out.println(strBuf);
	
		try{
			
		} catch(Exception e) {
			log.log(Level.SEVERE, "234234", e);
			
			e.getMessage();
		}

	}

}
