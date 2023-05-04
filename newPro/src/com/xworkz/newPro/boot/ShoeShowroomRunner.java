package com.xworkz.newPro.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.newPro.config.ShoeShowroomConfig;
import com.xworkz.newPro.dto.PolishDTO;
import com.xworkz.newPro.dto.SalesManagerDTO;
import com.xworkz.newPro.dto.ShoeDTO;
import com.xworkz.newPro.dto.ShoeShowRoomDTO;
import com.xworkz.newPro.dto.SockDTO;
import com.xworkz.newPro.repo.ShoeShowroomRepo;
import com.xworkz.newPro.service.PolishService;
import com.xworkz.newPro.service.SalesManagerService;
import com.xworkz.newPro.service.ShoeService;
import com.xworkz.newPro.service.ShoeShowroomService;
import com.xworkz.newPro.service.SockService;

public class ShoeShowroomRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfig.class);
		ShoeShowroomService serviseImpl = spring.getBean(ShoeShowroomService.class);
		ShoeShowRoomDTO shoeShowRoomDTO = new ShoeShowRoomDTO(12, "Akash Shoe Showroom", "Vijayapur", "GST53S");
		boolean save = serviseImpl.validateAndThensave(shoeShowRoomDTO);
		System.out.println("saved :" + save);
		System.out.println("*******************");
		System.out.println("ShoeDTO........");
		ShoeService shoeServiceImpl = spring.getBean(ShoeService.class);
		ShoeDTO shoeDTO = new ShoeDTO("Black", 18);
		boolean saved = shoeServiceImpl.validateAndSave(shoeDTO);
		System.out.println("saved :" + saved);
		System.out.println("*********************");
		System.out.println("SalesManagerDTO......");

		SalesManagerService salesManagerServiceImpl = spring.getBean(SalesManagerService.class);
		SalesManagerDTO salesManagerDTO = new SalesManagerDTO("Arun", 34);
		boolean saves = salesManagerServiceImpl.validateAndSave(salesManagerDTO);
		System.out.println("Saved:" + saves);
		System.out.println("*******************");
		System.out.println("Polish......");
		PolishService polishServiceImpl = spring.getBean(PolishService.class);
		PolishDTO polishDTO = new PolishDTO(20, "Black");
		boolean savess = polishServiceImpl.validateAndSave(polishDTO);
		System.out.println("saved :" + savess);
		System.out.println("************************");
		System.out.println("Sock...........");
		SockService sockServiceImpl = spring.getBean(SockService.class);
		SockDTO sockDTO = new SockDTO(3, 50, "Black");
		boolean stor = sockServiceImpl.validateAndSave(sockDTO);
		System.out.println("saved:" + stor);
	}

}
