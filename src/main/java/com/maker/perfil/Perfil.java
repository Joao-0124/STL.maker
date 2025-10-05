package com.maker.perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "PERFIL")
public class Perfil {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AUTOID;
	
	@Column(name = "DESCRICAO")
    private String DESCRICAO;

	public Integer getAUTOID() {
		return AUTOID;
	}

	public void setAUTOID(Integer aUTOID) {
		AUTOID = aUTOID;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}
	
	
	
}
