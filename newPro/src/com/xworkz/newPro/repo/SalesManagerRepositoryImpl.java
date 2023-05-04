package com.xworkz.newPro.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.SalesManagerDTO;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class SalesManagerRepositoryImpl implements SalesManagerRepository{
   private Collection<SalesManagerDTO> salesM= new ArrayList<SalesManagerDTO>();

	@Override
	public boolean save(SalesManagerDTO dto) {
		System.out.println("Running save method in SalesManagerRepositoryImpl:"+dto);
		return this.salesM.add(dto);
	}

}
