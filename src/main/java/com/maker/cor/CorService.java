package com.maker.cor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorService {

	@Autowired
	private CorRepository corRepository;
	
	public List<Cor> listarTodas(){
		return corRepository.findAll();
	}
	
	public Cor buscarPorId(Integer id){
		return corRepository.findById(id).get();
	}
	
	public Cor salvar(Cor cor) {
		return corRepository.save(cor);
	}
	
	public void deletar(Integer id) {
		Cor cor = corRepository.findById(id).get();
		
		corRepository.delete(cor);
	}
	
}
