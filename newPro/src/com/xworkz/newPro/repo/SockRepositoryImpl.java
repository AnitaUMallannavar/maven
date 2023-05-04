package com.xworkz.newPro.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.SockDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockRepositoryImpl implements SockRepository {
	private Collection<SockDTO> sock = new ArrayList<SockDTO>();

	@Override
	public boolean save(SockDTO dto) {
		System.out.println("Running save method in SockRepositoryImpl:" + dto);
		return this.sock.add(dto);
	}

}
