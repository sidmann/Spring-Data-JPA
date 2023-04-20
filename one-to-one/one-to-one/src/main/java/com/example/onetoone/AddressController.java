package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@RequestMapping("address/save")
	public Address save(@RequestBody Address address)
	{
		return addressRepository.save(address);
	}
	
	@RequestMapping("address/read")
	public Iterable<Address> load()
	{
		return addressRepository.findAll();
	}
}
