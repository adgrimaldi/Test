package com.adsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adsa.entity.ZONE_ENTITY;
import com.adsa.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/Guardar")
	public String getTransactionGuardar(Model model,
			@RequestParam(value="IdTabla") int IdTabla,
			@RequestParam(value="Zona") String Zona
			
			) {
		
		ZONE_ENTITY zona = new ZONE_ENTITY();
		
		zona.setIdTabla(IdTabla);
		zona.setZona(Zona);
		
		transactionService.saveZone(zona);
	
		return "done";
	}
}
