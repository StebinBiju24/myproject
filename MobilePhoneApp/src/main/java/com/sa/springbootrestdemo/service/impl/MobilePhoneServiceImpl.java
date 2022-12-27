package com.sa.springbootrestdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.springbootrestdemo.entities.MobilePhone;
import com.sa.springbootrestdemo.mapper.MobilePhoneMapper;
import com.sa.springbootrestdemo.repository.MobilePhoneRepository;
import com.sa.springbootrestdemo.service.MobilePhoneService;

@Service
public class MobilePhoneServiceImpl implements MobilePhoneService{
	
	@Autowired
	private MobilePhoneRepository mobileRepo;

//	@Autowired
//	private MobilePhoneMapper mapper;
	
	
	@Override
	public List<MobilePhone> getAllMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobilePhone saveMobilePhone(MobilePhone mobilePhone) {
		MobilePhone mob=null;
		
		mobileRepo.save(mobilePhone);
		return null;
	}

	@Override
	public MobilePhone getMobilePhoneById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
