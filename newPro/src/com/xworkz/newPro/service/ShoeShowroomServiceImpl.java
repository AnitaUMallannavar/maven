package com.xworkz.newPro.service;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.newPro.dto.ShoeShowRoomDTO;
import com.xworkz.newPro.repo.ShoeShowroomRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowroomServiceImpl implements ShoeShowroomService {
	private ShoeShowroomRepo shoeShowroomRepo;
	private Validator validator;

	@Override
	public boolean validateAndThensave(ShoeShowRoomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<ShoeShowRoomDTO>> violation = this.validator.validate(dto);
			if (!violation.isEmpty()) {
				System.out.println("Total no of Violation :" + violation.size());
				violation.forEach(s -> System.err.println(s.getPropertyPath() + " " + s.getMessage()));
			} else {
				return this.shoeShowroomRepo.save(dto);
			}
		} else {
			System.err.println("dto is null");

		}
		return false;
	}

}
