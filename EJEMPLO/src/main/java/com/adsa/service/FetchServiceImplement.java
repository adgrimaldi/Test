package com.adsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adsa.DAO.I_ZONE;
import com.adsa.entity.ZONE_ENTITY;

@Service
public class FetchServiceImplement implements FetchService{

	@Autowired
	private I_ZONE zone;
	
	
	@Override
	public List<ZONE_ENTITY> getAllZones() {
		
		return (List<ZONE_ENTITY>) zone.findAll();
	}

}
