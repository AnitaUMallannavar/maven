package com.xworkz.newPro.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.SockDTO;
import com.xworkz.newPro.repo.SockRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockServiceImpl implements SockService {
	private SockRepository sockRepository;
	private Validator validator;

	@Override
	public boolean validateAndSave(SockDTO dto) {
		System.out.println("Running validateAndSave in SockServiceImpl:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SockDTO>> violation = validator.validate(dto);
			if (!violation.isEmpty()) {
				System.out.println("total no of Violation:" + violation.size());
				violation.forEach(s -> System.err.println(s.getPropertyPath() + " " + s.getMessage()));
				return false;
			}
			return this.sockRepository.save(dto);
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
