package com.xworkz.autowired.things;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
public class Guide {
	
    // private double code; 
	
	private Security security;
}
