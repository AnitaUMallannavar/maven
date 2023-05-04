package com.xworkz.newPro.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.SalesManagerDTO;
import com.xworkz.newPro.repo.SalesManagerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {
	private SalesManagerRepository salesManagerRepository;
	private Validator validator;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SalesManagerDTO>> violation = validator.validate(dto);
			if (!violation.isEmpty()) {
				System.out.println("Total no of violation :" + violation.size());
				violation.forEach(s -> System.err.println(s.getPropertyPath() + "" + s.getMessage()));
				return false;
			}
			return this.salesManagerRepository.save(dto);
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
