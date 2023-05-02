package com.xworkz.horror.things31;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString


public class Pizza {
	private String name;
	private int cost;
	private double code;
	private String madeBy;
	private String madeIn;
	private String madeFor;
	private String memberOfshares;
	private int id;
	private String madeTo;
	private String shape;
	private int ratings;
	private String location;
	private String flaver;

	public Pizza() {
		System.out.println("creating no args in pizza");
	}

}
