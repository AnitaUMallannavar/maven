package com.xworkz.newPro.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.ShoeDTO;
import com.xworkz.newPro.dto.ShoeShowRoomDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ShoeRepositoryImpl implements ShoeRepository {
	private Collection<ShoeDTO> shoe = new ArrayList<ShoeDTO>();

	@Override
	public boolean save(ShoeDTO dto) {
		System.out.println("Running save method in ShoeRepositoryImpl" + dto);
		return this.shoe.add(dto);
	}

}
