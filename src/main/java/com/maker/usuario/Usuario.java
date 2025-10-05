package com.maker.usuario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.maker.perfil.Perfil;

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
@Table(name = "USUARIO")
public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AUTOID;
	
	@Column(name = "USUARIO")
    private String usuario;
	
	@Column(name = "MATRICULA")
    private Integer matricula;
	
	@Column(name = "EMAIL")
    private String email;
	
	@Column(name = "NOME")
    private String nome;
	
	@Column(name = "SENHA")
    private String senha;
	
	@ManyToOne 
	@JoinColumn(name = "PERFIL_ID")
	@JsonBackReference
    private Perfil perfil_id;

	public Integer getAUTOID() {
		return AUTOID;
	}

	public void setAUTOID(Integer aUTOID) {
		AUTOID = aUTOID;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(Perfil perfil_id) {
		this.perfil_id = perfil_id;
	}
	
	
	
}
