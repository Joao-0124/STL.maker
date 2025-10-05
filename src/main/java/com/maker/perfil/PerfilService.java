package com.maker.perfil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository perfilRepository;
	
	public List<Perfil> listarTodas(){
		return perfilRepository.findAll();
	}
	
	public Perfil buscarPorId(Integer id){
		return perfilRepository.findById(id).get();
	}
	
	public Perfil salvar(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	public void deletar(Integer id) {
		Perfil perfil = perfilRepository.findById(id).get();
		
		perfilRepository.delete(perfil);
	}
	
	
}