package com.xworkz.autowired.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Security {
	
	
//	private int password;
	  @Autowired
      private Things things;
	  
	  
}
