package com.maker.status_prioridade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Status_PrioridadeService {

	@Autowired
	private Status_PrioridadeRepository status_prioridadeRepository;
	
	public List<Status_Prioridade> listarTodas(){
		return status_prioridadeRepository.findAll();
	}
	
	public Status_Prioridade buscarPorId(Integer id){
		return status_prioridadeRepository.findById(id).get();
	}
	
	public Status_Prioridade salvar(Status_Prioridade status_prioridade) {
		return status_prioridadeRepository.save(status_prioridade);
	}
	
	public void deletar(Integer id) {
		Status_Prioridade status_prioridade = status_prioridadeRepository.findById(id).get();
		
		status_prioridadeRepository.delete(status_prioridade);
	}
	
}
