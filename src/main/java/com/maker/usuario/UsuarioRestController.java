package com.maker.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> buscarTodas() {
		return usuarioService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Usuario buscarPorId(@PathVariable("autoid") Integer autoid) {
		return usuarioService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("AUTOID") Integer autoid) {
		usuarioService.deletar(autoid);
	}
	
	@PutMapping("/{autoid}")
	public Usuario atualizarUsuario(@PathVariable("autoid") Integer autoid, @RequestBody Usuario usuario) {
	    return usuarioService.atualizarUsuario(autoid, usuario);
    }
	
	@PatchMapping("/{autoid}")
	public Usuario atualizarUsuarioParcial(@PathVariable("autoid") Integer autoid, 
	                                       @RequestBody Usuario usuario) {
	    return usuarioService.atualizarUsuarioParcial(autoid, usuario);
	}

}
