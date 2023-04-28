package com.xwoekz.quarkus.service;

import com.xwoekz.quarkus.dto.ShowroomDTO;

public class ShowroomServiceImpl implements ShowroomService{

	@Override
	public boolean validateAndThenSave(ShowroomDTO dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}

}
