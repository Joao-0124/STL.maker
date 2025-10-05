package com.maker.solicitacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maker.usuario.Usuario;

@RestController
@RequestMapping(value="/solicitacao")
public class SolicitacaoRestController {
	
	@Autowired
	private SolicitacaoService solicitacaoService;
	
	@GetMapping
	public List<Solicitacao> buscarTodas() {
		return solicitacaoService.listarTodas();
	}
	
	@GetMapping("/{autoid}")
	public Solicitacao buscarPorId(@PathVariable("autoid") Integer autoid) {
		return solicitacaoService.buscarPorId(autoid);
	}
	
	@PostMapping
	public Solicitacao salvar(@RequestBody Solicitacao solicitacao) {
		return solicitacaoService.salvar(solicitacao);
	}
	
	@DeleteMapping("/{autoid}")
	public void deletar(@PathVariable("autoid") Integer autoid) {
		solicitacaoService.deletar(autoid);
	}
	@PatchMapping("/{autoid}")
    public Solicitacao atualizarSolicitacaoParcial(@PathVariable("autoid") Integer autoid,
                                                   @RequestBody Solicitacao solicitacao) {
        return solicitacaoService.atualizarSolicitacaoParcial(autoid, solicitacao);
    }


}
