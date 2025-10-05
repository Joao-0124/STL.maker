package com.maker.filamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilamentoService {
	
	@Autowired
	private FilamentoRepository filamentoRepository;
	
	public List<Filamento> listarTodas(){
		return filamentoRepository.findAll();
	}
	
	public Filamento buscarPorId(Integer id){
		return filamentoRepository.findById(id).get();
	}
	
	public Filamento salvar(Filamento filamento) {
		return filamentoRepository.save(filamento);
	}
	
	public void deletar(Integer id) {
		Filamento filamento = filamentoRepository.findById(id).get();
		
		filamentoRepository.delete(filamento);
	}
	

}
