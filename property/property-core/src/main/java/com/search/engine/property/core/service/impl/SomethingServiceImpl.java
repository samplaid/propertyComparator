package com.search.engine.property.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.search.engine.property.core.persistence.entity.SomethingEntity;
import com.search.engine.property.core.persistence.repository.SomethingRepository;
import com.search.engine.property.core.service.SomethingService;

@Service
@Transactional
public class SomethingServiceImpl implements SomethingService {

	@Autowired
	private SomethingRepository somethingRepository; 
	
	@Override
	public List<SomethingEntity> doSomething() {
		return somethingRepository.findAll();
	}

}
