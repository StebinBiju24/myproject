package com.sa.springbootrestdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sa.springbootrestdemo.controller.dto.MobilePhoneDto;
import com.sa.springbootrestdemo.entities.MobilePhone;


@Mapper
public interface MobilePhoneMapper {
	@Mapping(source = "mobilePhone.mobileId", target = "mobileId")//Source - Entity, target- Dto
	
	public MobilePhoneDto convertToDto(MobilePhone mobilePhone);
}
