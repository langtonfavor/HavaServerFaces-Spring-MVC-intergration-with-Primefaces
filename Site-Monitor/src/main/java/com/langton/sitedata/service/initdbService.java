package com.langton.sitedata.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.langton.sitedata.entity.Check;
import com.langton.sitedata.repository.CheckRepository;

@Service
public class initdbService {

	@Autowired
	private CheckRepository checkRepository;

	@PostConstruct
	public void init() {
		System.out.println("*** INIT DATABASE START ***");
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("tutorials");
			check.setUrl("http://www.virtualpairsprogrammer.net");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("java");
			check.setUrl("http://www.curveofprogramming.com");
			checkRepository.save(check);
		}
		System.out.println("*** INIT DATABASE FINISH ***");
	}
}
