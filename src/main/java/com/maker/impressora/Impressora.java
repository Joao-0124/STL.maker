package com.maker.impressora;

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
@Table(name = "IMPRESSORA")

public class Impressora {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AUTOID;
	
	@Column(name = "NOME")
    private String nome;
	
	@Column(name = "MODELO")
    private String modelo;
	
	@Column(name = "DIMENSAO_XYZ")
    private String dimensao_xyz;

	public Integer getAUTOID() {
		return AUTOID;
	}

	public void setAUTOID(Integer aUTOID) {
		AUTOID = aUTOID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDimensao_xyz() {
		return dimensao_xyz;
	}

	public void setDimensao_xyz(String dimensao_xyz) {
		this.dimensao_xyz = dimensao_xyz;
	}

	
	

	
}
