package com.xwoekz.quarkus.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xwoekz.quarkus.dto.ShowroomDTO;

public class ShowroomRepositoryImpl implements ShowroomRepository {

	Collection<ShowroomDTO> dtos = new ArrayList<ShowroomDTO>();

	@Override
	public boolean save(ShowroomDTO dto) {
		System.out.println("Running save method in ShowroomRepositoryImpl:" + dto);
		return this.dtos.add(dto);
	}
    
}
