package com.maker.filamento;

import com.maker.cor.Cor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "FILAMENTO")
public class Filamento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AUTOID;
	
	@Column(name = "DESCRICAO")
    private String descricao;
	
	@ManyToOne 
	@JoinColumn(name = "COR_ID")
    private Cor cor_id;

	public Integer getAUTOID() {
		return AUTOID;
	}

	public void setAUTOID(Integer aUTOID) {
		AUTOID = aUTOID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cor getCor_id() {
		return cor_id;
	}

	public void setCor_id(Cor cor_id) {
		this.cor_id = cor_id;
	}
	
	

}

