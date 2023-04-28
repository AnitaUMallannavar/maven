package com.xwoekz.quarkus.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.xwoekz.quarkus.constant.ShowroomLocation;

public class ShowroomDTO implements Serializable,Comparable<ShowroomDTO>{
	 
	 @Max(value = 999,message = "id should be less than 999")
	 @Min(value = 1,message = "id should be greater than 1")
     private int id;
	 
	 @NotEmpty
	 @NotNull
     private String name;
     private ShowroomLocation location;
     private long number;
     private LocalDateTime openDate;
     private boolean closed;
     
     public ShowroomDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShowroomDTO(int id, String name, ShowroomLocation location, long number, LocalDateTime openDate,
			boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "ShowroomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (closed ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShowroomDTO other = (ShowroomDTO) obj;
		if (closed != other.closed)
			return false;
		if (id != other.id)
			return false;
		if (location != other.location)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShowroomLocation getLocation() {
		return location;
	}

	public void setLocation(ShowroomLocation location) {
		this.location = location;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public LocalDateTime getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDateTime openDate) {
		this.openDate = openDate;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public int compareTo(ShowroomDTO o) {
		
		return this.name.compareTo(o.getName());
	}
	
}
