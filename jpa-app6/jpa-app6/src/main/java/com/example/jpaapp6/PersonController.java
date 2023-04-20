package com.example.jpaapp6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("save")
	public Person save(@RequestBody Person person)
	{
		return personRepository.save(person);
	}
	
	@RequestMapping("findAll/firstName/{firstName}")
	public Iterable<Person> readAll(@PathVariable String firstName)
	{
		return personRepository.findAllByFirstName(firstName);
	}
	
	@RequestMapping("allLastName/lastName/{lastName}")
	public Iterable<Person> allLastName(@PathVariable String lastName)
	{
		return personRepository.findAllByLastName(lastName);
	}
	
	@RequestMapping("allAge/age/{age}")
	public Iterable<Person> allAge(@PathVariable Integer age)
	{
		return personRepository.findAllByAge(age);
	}
	
	@RequestMapping("findByEmail/email/{email}")
	public Person email(@PathVariable String email)
	{
		return personRepository.findByEmail(email);
	}
	
	@RequestMapping("allFirstName/firstName/like/{firstName}")
	public Iterable<Person> readAllbyfirstname(@PathVariable String firstName)
	{
		return personRepository.findAllByFirstNameLike("%"+firstName+"%");
	}
	
	@RequestMapping("AllFirst&LastName/firstname/{firstname}/lastname/{lastname}")
	public Iterable<Person> readAllFirstNameLastName(@PathVariable String firstName,
			                                         @PathVariable String lastName)
	{
		return personRepository.findAllByFirstNameOrLastName(firstName, lastName);
	}
	
	@RequestMapping("AllGreaterAge/age/greater/{age}")
	public Iterable<Person> readAllWithAgeGreater(@PathVariable Integer age)
	{
		return personRepository.findAllByAgeGreaterThan(age);
	}
	
	@RequestMapping("read1/{email}")
	public String r1(@PathVariable String email)
	{
		return personRepository.read1(email);
	}
	
	@RequestMapping("read2/{email}")
	public String r2(@PathVariable String email)
	{
		return personRepository.read2(email);
	}
	
	@RequestMapping("read3/{email}")
	public String r3(@PathVariable String email)
	{
		return personRepository.read3(email);
	}
	
	@RequestMapping("read4/{age}")
	public Iterable<String> r4(@PathVariable Integer age)
	{
		return personRepository.read4(age);
	}
	
	@RequestMapping("read5")
	public Iterable<Object[]> r5()
	{
		return personRepository.read5();
	}
	
	@RequestMapping("read6")
	public Iterable<Person> r6()
	{
		return personRepository.read6();
	}
	
	@RequestMapping("read7/{personId}")
	public Iterable<Person> read7(@PathVariable Integer personId) {
		return personRepository.read7(personId);
	}
	
	@RequestMapping("read8/{id}/{firstName}")
	public Iterable<Integer> read8(@PathVariable Integer id, String firstName) {
		return personRepository.read8(id, firstName);
	}
	
	@RequestMapping("read9/{id}/{firstName}")
	public Iterable<Object[]> read9(@PathVariable Integer id, String firstName) {
		return personRepository.read9(id, firstName);
	}
	
	@RequestMapping("read10")
	public Iterable<Person> read10(){
		return personRepository.read10();
	}
	
	@RequestMapping("read11/{firstName}")
	public Iterable<Person> read11(@PathVariable String firstName){
		return personRepository.read11(firstName);
	}
	
	@RequestMapping("read12")
	public Iterable<Object[]> read12(){
		return personRepository.read12();
	}
 
	@RequestMapping("read13")
	public Iterable<Integer> read13(){
		return personRepository.read13();
	}
	
	@RequestMapping("read14")
	public Iterable<PersonDTO> read14(){
		return personRepository.read14();
	}
}
