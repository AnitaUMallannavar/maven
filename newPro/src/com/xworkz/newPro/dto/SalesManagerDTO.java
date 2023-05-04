package com.xworkz.newPro.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable,Comparable<SalesManagerDTO>{
	@Size(max = 100,min = 1)
	@NotNull
	@NotEmpty
     private String MName;
	@Max(value = 400)
	@Min(value = 1)
     private int id;
	@Override
	public int compareTo(SalesManagerDTO o) {
		
		return this.getMName().compareTo(o.getMName());
	}
}
