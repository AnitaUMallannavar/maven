package com.xworkz.newPro.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.ShoeShowRoomDTO;

@Component
public class ShoeShowroomeRepoImpl implements ShoeShowroomRepo {
	private Collection<ShoeShowRoomDTO> shoeShowroom = new ArrayList<ShoeShowRoomDTO>();

	public ShoeShowroomeRepoImpl(Collection<ShoeShowRoomDTO> shoeShowroom) {
		this.shoeShowroom = shoeShowroom;
	}
	
	public ShoeShowroomeRepoImpl() {
	  System.out.println("creating no args const in ShoeShowroomeRepoImpl");
	}

	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		System.out.println("Running save in ShoeShowroomeRepoImpl" + dto);
		return shoeShowroom.add(dto);
	}

}
