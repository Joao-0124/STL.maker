package com.maker.solicitacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/solicitacao")
public class SolicitacaoRestController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @GetMapping
    public List<Solicitacao> buscarTodas() {
        return solicitacaoService.listarTodas();
    }

    // ✅ AGORA SÓ UM GET /solicitacao/{autoid}
    @GetMapping("/{autoid}")
    public ResponseEntity<Solicitacao> buscarPorId(@PathVariable("autoid") Integer autoid) {
        Optional<Solicitacao> opt = solicitacaoService.buscarPorId(autoid);

        if (opt.isPresent()) {
            return ResponseEntity.ok(opt.get());
        }

        // evita 500 quando não encontra
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
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
    public Solicitacao atualizarSolicitacaoParcial(
            @PathVariable("autoid") Integer autoid,
            @RequestBody Solicitacao solicitacao) {
        return solicitacaoService.atualizarSolicitacaoParcial(autoid, solicitacao);
    }
}
