package com.maker.impressora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpressoraService {
	
	@Autowired
	private ImpressoraRepository impressoraRepository;
	
	public List<Impressora> listarTodas(){
		return impressoraRepository.findAll();
	}
	
	public Impressora buscarPorId(Integer id){
		return impressoraRepository.findById(id).get();
	}
	
	public Impressora salvar(Impressora impressora) {
		return impressoraRepository.save(impressora);
	}
	
	public void deletar(Integer id) {
		Impressora impressora = impressoraRepository.findById(id).get();
		
		impressoraRepository.delete(impressora);
	}

}
