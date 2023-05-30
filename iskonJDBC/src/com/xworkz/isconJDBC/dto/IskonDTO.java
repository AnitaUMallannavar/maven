package com.xworkz.isconJDBC.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class IskonDTO implements Serializable, Comparable<IskonDTO> {

	@NotEmpty
	@NotNull
	@Size(min = 2, max = 80)
	private String godName;

	@NotEmpty
	@NotNull
	@Size(max = 70, min = 1)
	private String location;

	@Max(value = 80)
	@Min(value = 1)
	private float entryFee;

	@Max(value = 90)
	@Min(value = 2)
	private double area;

	@Override
	public int compareTo(IskonDTO o) {
		return this.getGodName().compareTo(o.godName);
	}

}
