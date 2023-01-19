package com.adsa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ZONE", schema="wms")
public class ZONE_ENTITY implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id")
	private Integer IdTabla;
	
	@Column(name="Zone")
	private String Zona;

	public Integer getIdTabla() {
		return IdTabla;
	}

	public void setIdTabla(Integer idTabla) {
		IdTabla = idTabla;
	}

	public String getZona() {
		return Zona;
	}

	public void setZona(String zona) {
		Zona = zona;
	}
	
}
