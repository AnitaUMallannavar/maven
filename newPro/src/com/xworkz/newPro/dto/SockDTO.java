package com.xworkz.newPro.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SockDTO implements Serializable, Comparable<SockDTO> {
	@Max(value = 60)
	@Min(value = 2)
	private int noOfSock;

	@Max(value = 100)
	@Min(value = 8)
	private int cost;

	@Size(max = 30, min = 2)
	@NotNull
	@NotEmpty
	private String colour;

	@Override
	public int compareTo(SockDTO o) {
		return this.getColour().compareTo(o.getColour());
	}
}
