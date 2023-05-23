package com.xworkz.autowired.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
public class EntryFee {
	
  private SensoredDoor sensoredDoor;
}
