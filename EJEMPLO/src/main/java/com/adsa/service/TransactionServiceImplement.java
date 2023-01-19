package com.adsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adsa.DAO.I_ZONE;
import com.adsa.entity.ZONE_ENTITY;

@Service
public class TransactionServiceImplement implements TransactionService{

	@Autowired
	private I_ZONE zone;
	
	
	@Override
	public void saveZone(ZONE_ENTITY zona) {
		zone.save(zona);
	}

}
