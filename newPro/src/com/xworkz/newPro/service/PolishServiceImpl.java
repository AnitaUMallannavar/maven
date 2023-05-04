package com.xworkz.newPro.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.PolishDTO;
import com.xworkz.newPro.repo.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {
	private PolishRepository polishRepository;
	private Validator validator;

	@Override
	public boolean validateAndSave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<PolishDTO>> constraint = validator.validate(dto);

			if (!constraint.isEmpty()) {
				System.out.println("Total no of violation :" + constraint.size());
				constraint.forEach(s -> System.err.println(s.getPropertyPath() + "" + s.getMessage()));
				return false;
			}
			return this.polishRepository.save(dto);
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
