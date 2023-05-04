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
public class ShoeDTO implements Serializable, Comparable<ShoeDTO> {
	@Size(max = 30, min = 1)
	@NotEmpty
	@NotNull
	private String colour;

	@Max(value = 1000)
	@Min(value = 1)
	private double cost;

	@Override
	public int compareTo(ShoeDTO o) {
		return this.getColour().compareTo(o.getColour());
	}

}
