package com.xworkz.autowired.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class Camera {

	//private float codeCost;
	@Autowired
	private Guide guide;
}
