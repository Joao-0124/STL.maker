package com.maker.cor;

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
@RequestMapping(value="/cor")

public class CorRestController {

	@Autowired
	private CorService corService;
	
	@GetMapping
	public List<Cor> buscarTodas() {
		return corService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Cor buscarPorId(@PathVariable("AUTOID") Integer autoid) {
		return corService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Cor salvar(@RequestBody Cor cor) {
		return corService.salvar(cor);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable Integer autoid) {
		corService.deletar(autoid);
	}
	
}
