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
public class PolishDTO implements Serializable, Comparable<PolishDTO> {
	@Max(value = 1000)
	@Min(value = 10)
	private int cost;
	@Size(max = 100, min = 1)
	@NotNull
	@NotEmpty
	private String colour;

	@Override
	public int compareTo(PolishDTO o) {
		return this.getColour().compareTo(o.getColour());
	}
}
