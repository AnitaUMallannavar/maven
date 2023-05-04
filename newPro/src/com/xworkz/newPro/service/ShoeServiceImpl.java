package com.xworkz.newPro.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.ShoeDTO;
import com.xworkz.newPro.repo.ShoeRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeServiceImpl implements ShoeService {
	private ShoeRepository shoeRepository;
	private Validator validator;

	@Override
	public boolean validateAndSave(ShoeDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null" + dto);
			Set<ConstraintViolation<ShoeDTO>> violation = validator.validate(dto);
			if (!violation.isEmpty()) {
				System.out.println("Total no of violation:" + violation.size());
				violation.forEach(s -> System.err.println(s.getPropertyPath() + " " + s.getMessage()));
				return false;
			}
			return this.shoeRepository.save(dto);
		} else {
			System.err.println("Dto is null");
		}
		return false;
	}

}
