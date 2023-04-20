package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@RequestMapping("skill/save")
	public Skill save(@RequestBody Skill skill) {
		return skillService.save(skill);
	}
	
	@RequestMapping("skill/load")
	public Iterable<Skill> load() {
		return skillService.load();
	}
}
