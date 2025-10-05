package com.maker.status_prioridade;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/status_prioridade")
public class Status_PrioridadeRestController {
	
	private Status_PrioridadeService status_prioridadeService;
	
	@GetMapping
	public List<Status_Prioridade> buscarTodas() {
		return status_prioridadeService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Status_Prioridade buscarPorId(@PathVariable("AUTOID") Integer autoid) {
		return status_prioridadeService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Status_Prioridade salvar(@RequestBody Status_Prioridade status_prioridade) {
		return status_prioridadeService.salvar(status_prioridade);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("autoid") Integer autoid) {
		status_prioridadeService.deletar(autoid);
	}

}
