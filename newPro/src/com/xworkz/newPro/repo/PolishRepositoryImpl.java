package com.xworkz.newPro.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.PolishDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishRepositoryImpl implements PolishRepository {
	private Collection<PolishDTO> polish = new ArrayList<PolishDTO>();

	@Override
	public boolean save(PolishDTO dto) {
		System.out.println("Running save method in PolishRepositoryImpl:" + dto);
		return this.polish.add(dto);
	}

}
