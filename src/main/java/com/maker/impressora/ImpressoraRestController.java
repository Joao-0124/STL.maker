package com.maker.impressora;

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
@RequestMapping(value="/impressora")

public class ImpressoraRestController {

	@Autowired
	private ImpressoraService impressoraService;
	
	@GetMapping
	public List<Impressora> buscarTodas() {
		return impressoraService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Impressora buscarPorId(@PathVariable("AUTOID") Integer autoid) {
		return impressoraService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Impressora salvar(@RequestBody Impressora impressora) {
		return impressoraService.salvar(impressora);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("autoid") Integer autoid) {
		impressoraService.deletar(autoid);
	}
	
	
	
}
