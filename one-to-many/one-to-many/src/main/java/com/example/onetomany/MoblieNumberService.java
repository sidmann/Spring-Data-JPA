package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoblieNumberService {
	
	@Autowired
	private MobileNumberRepository mobileNumberRepository;
	
	public MobileNumber save(MobileNumber mobileNumber)
	{
		return mobileNumberRepository.save(mobileNumber);
	}
	
	public Iterable<MobileNumber> load()
	{
		return mobileNumberRepository.findAll();
	}
	
}
