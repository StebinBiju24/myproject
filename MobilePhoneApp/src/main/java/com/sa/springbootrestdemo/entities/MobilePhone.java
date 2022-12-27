package com.sa.springbootrestdemo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //Default Constructor
@AllArgsConstructor //Parameterized Constructor
@Data //Getter and setter methods
@Entity //Maps as a table in DB
public class MobilePhone{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	private String brandName;
	private String modelName;
	private String color;
	private String batteryPower;
	private String processor;
	private double mobilePhoneCost;
}
