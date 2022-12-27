package com.sa.springbootrestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.springbootrestdemo.entities.MobilePhone;
import com.sa.springbootrestdemo.service.MobilePhoneService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/mobile")
public class MobilePhoneController {
	@Autowired
	private MobilePhoneService service;
	
	@PostMapping("/mobile/add")
	@Operation(summary = "To add a Product")
	public ResponseEntity<?> post(@RequestBody MobilePhone mp){
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(service.saveMobilePhone(mp), HttpStatus.CREATED);
		return response;
	}
}
