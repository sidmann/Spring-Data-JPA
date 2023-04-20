package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileNumberController {
	
	@Autowired
	private MoblieNumberService moblieNumberService;
	
	@RequestMapping("mobileNumber/save")
	public MobileNumber save(@RequestBody MobileNumber mobileNumber)
	{
		return moblieNumberService.save(mobileNumber);
	}
	
	@RequestMapping("mobileNumber/load")
	public Iterable<MobileNumber> load()
	{
		return moblieNumberService.load();
	}
}
