package com.xworkz.autowired.things;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Musuem {
	
    private EntryFee entryFee;
}
