package com.sa.springbootrestdemo.service;

import java.util.List;

import com.sa.springbootrestdemo.entities.MobilePhone;

public interface MobilePhoneService {
	
	public List<MobilePhone> getAllMobiles();
    
	public MobilePhone saveMobilePhone(MobilePhone mobilePhone);
	    
	public MobilePhone getMobilePhoneById(long id);
	 
//	public MobilePhone getMobilePhoneByBrandName(String brandName);    
//	 
//	public MobilePhone getMobilePhoneByModelName(String modelName);    
//	    
//	public MobilePhone editMobilephone(MobilePhone mobilePhone);
//	    
//	public String deleteMobilePhone(long id);
//	    
//	public List<MobilePhoneDto> getAllMobilePhones();
//	 
//	public MobilePhoneDto getMobilePhoneById(long id);
//	 
//	public List<MobilePhoneDto> getMobilePhoneByBrandName(String brandName);    
//	 
//	public List<MobilePhoneDto> getMobilePhoneByModelName(String modelName);
//	 
//	public int getMobilePhone(double cost); //get total number of mobile phones who having cost > 10K
//	 
//	public List<MobilePhone> getByProcessor(String processor); //get Mobile Phone whose having processor with name - Quad Core
//	 
//	public List<MobilePhone> getByColor(); //get Mobile Phone whose having color - black and blue
//	 
//	public int getMobilePhones(); //get total number of mobile phone who are having unique model names
//	 
//	public MobilePhoneList addMobilePhoneToList(long mobilePhoneId, long MobilePhoneListId); //adding mobilePhone to MobilePhoneList
}
