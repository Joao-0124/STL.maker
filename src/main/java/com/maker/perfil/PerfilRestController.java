package com.maker.perfil;

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
@RequestMapping(value="/perfil")

public class PerfilRestController {
	@Autowired
	private PerfilService perfilService;
	
	@GetMapping
	public List<Perfil> buscarTodas() {
		return perfilService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Perfil buscarPorId(@PathVariable("AUTOID") Integer autoid) {
		return perfilService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Perfil salvar(@RequestBody Perfil perfil) {
		return perfilService.salvar(perfil);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("autoid") Integer autoid) {
		perfilService.deletar(autoid);
	}
	
}
