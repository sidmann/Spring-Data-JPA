package com.example.manytomany;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String skillName;
	private String skillDesc;
	@ManyToMany(mappedBy = "skills")
	@JsonIgnore
	private Set<Student> students = new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
/*
	{
		"skillName": "C",
		"skillDesc": "This is a C skill"
	}
	
	{
		"skillName": "C++",
		"skillDesc": "This is a C++ skill"
	}
	
	{
		"skillName": "Java",
		"skillDesc": "This is a Java skill"
	}
	
*/

