package com.maker.solicitacao;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.maker.cor.Cor;
import com.maker.filamento.Filamento;
import com.maker.impressora.Impressora;
import com.maker.status_prioridade.Status_Prioridade;
import com.maker.usuario.Usuario;

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

/**
 * 
 */
@Entity
@Getter
@Setter
@Table(name = "SOLICITACAO")
public class Solicitacao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AUTOID;
	
	@Column(name = "NOME")
    private String nome;
	
	@Column(name = "QUANTIDADE")
    private Integer quantidade;
	
	@Column(name = "DIMENSAO_XYZ")
    private String dimensao_xyz;
	
	@Column(name = "DESCRICAO")
    private String descricao;
	
	@ManyToOne 
	@JoinColumn(name = "COR_ID")
	@JsonBackReference
    private Cor cor_id;
	
	@ManyToOne 
	@JoinColumn(name = "FILAMENTO_ID")
	@JsonBackReference
    private Filamento filamento_id;
	
	@ManyToOne 
	@JoinColumn(name = "USUARIO_ID")
	@JsonBackReference
    private Usuario usuario_id;
	
	@ManyToOne 
	@JoinColumn(name = "IMPRESSORA_ID")
	@JsonBackReference
    private Impressora impressora_id;
	
	@ManyToOne 
	@JoinColumn(name = "STATUS_PRIORIDADE_ID")
	@JsonBackReference
    private Status_Prioridade status_prioridade_id;

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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDimensao_xyz() {
		return dimensao_xyz;
	}

	public void setDimensao_xyz(String dimensao_xyz) {
		this.dimensao_xyz = dimensao_xyz;
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

	public Filamento getFilamento_id() {
		return filamento_id;
	}

	public void setFilamento_id(Filamento filamento_id) {
		this.filamento_id = filamento_id;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Impressora getImpressora_id() {
		return impressora_id;
	}

	public void setImpressora_id(Impressora impressora_id) {
		this.impressora_id = impressora_id;
	}

	public Status_Prioridade getStatus_prioridade_id() {
		return status_prioridade_id;
	}

	public void setStatus_prioridade_id(Status_Prioridade status_prioridade_id) {
		this.status_prioridade_id = status_prioridade_id;
	}
	
	

}


