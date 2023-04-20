package com.example.jpaapp6;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person , Integer> {
	
	public Iterable<Person> findAllByFirstName(String firstName);
	public Iterable<Person> findAllByLastName(String lastName);
	public Iterable<Person> findAllByAge(Integer age);
	public Person findByEmail(String email);
	public Iterable<Person> findAllByFirstNameLike(String firstName);
	public Iterable<Person> findAllByFirstNameOrLastName(String firstName,String lastName);
	public Iterable<Person> findAllByAgeGreaterThan(Integer age);
	
	@Query("select firstName from Person p where p.email=:email")
	public String read1(String email);
	
	@Query("select firstName from Person p where p.email=:arg")
	public String read2(String arg);
	
	@Query("select firstName from Person p where p.email= ?1")
	public String read3(String email);
	
	@Query("select firstName from Person p where p.age >? 1")//jql query (jpa query language)
	public Iterable<String> read4(Integer age);
	
	@Query("select firstName,lastName from Person")//jql query (jpa query language)
	public Iterable<Object[]> read5();
	
	@Query("from Person")
	public Iterable<Person> read6();
	
	@Query("from Person p where p.id <= :personId")
	 public Iterable<Person> read7(Integer personId);
	 
	@Query("select age from Person p where p.id <= :arg1 or p.firstName = :arg2")
	public Iterable<Integer> read8(Integer arg1, String arg2);
	
	@Query("select age,email from Person p where p.id <= ?1 or p.firstName = ?2")
	public Iterable<Object[]> read9(Integer arg1, String arg2);
	
	@Query(value = "select * from person", nativeQuery = true)
	public Iterable<Person> read10();
	
	@Query(value = "select * from person where first_name = ?1", nativeQuery = true)
	public Iterable<Person> read11(String firstName);
	
	@Query(value = "select first_name, last_name from person", nativeQuery = true)
	public Iterable<Object[]> read12();
	
	@Query(value = "select last_name from person", nativeQuery = true)
	public Iterable<Integer> read13();

	@Query("select new com.example.jpaapp6.PersonDTO(p.firstName, p.email, p.age) from Person p")
	public Iterable<PersonDTO> read14();
}
