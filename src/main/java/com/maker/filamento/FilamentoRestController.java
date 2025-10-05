package com.maker.filamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/filamento")
public class FilamentoRestController {
	
	@Autowired
	private FilamentoService filamentoService;
	
	@GetMapping
	public List<Filamento> buscarTodas() {
		return filamentoService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Filamento buscarPorId(@PathVariable("AUTOID") Integer autoid) {
		return filamentoService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Filamento salvar(@RequestBody Filamento filamento) {
		return filamentoService.salvar(filamento);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("autoid") Integer autoid) {
		filamentoService.deletar(autoid);
	}
	

}
