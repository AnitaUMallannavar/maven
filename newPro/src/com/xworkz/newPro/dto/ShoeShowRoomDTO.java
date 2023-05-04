package com.xworkz.newPro.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.Value;

@Component
@AllArgsConstructor
@Data
public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {

	@Max(value = 500, message = "id must be less than 500 ")
	@Min(value = 1, message = "id <1")
	private int id;

	@NotNull(message = "name should not be null")
	@NotEmpty(message = "name should not be empty")
	@Size(min = 5,max=50)
	private String name;
	@NotNull(message = "address should not be null")
	@NotEmpty(message = "addessv should not be Empty")
	private String address;
	@NotNull(message = "gstNo should not be null")
	@NotEmpty(message = "gstNo should not be empty")
	private String gstNo;

	public ShoeShowRoomDTO() {
		System.out.println("creating no args const in ShoeShowRoom");
	}

	public void disply() {
		System.out.println("Running display method in ShoeShowRoomDTO");
		System.out.println("Running display method in ShoeShowRoom");
		System.out.println(this.id = id);
		System.out.println(this.name = name);
		System.out.println(this.address = address);
		System.out.println(this.gstNo = gstNo);
	}

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
