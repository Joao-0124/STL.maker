package com.maker.solicitacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maker.usuario.Usuario;

@Service
public class SolicitacaoService {
	
	@Autowired
	private SolicitacaoRepository solicitacaoRepository;
	
	public List<Solicitacao> listarTodas(){
		return solicitacaoRepository.findAll();
	}
	
	public Solicitacao buscarPorId(Integer id){
		return solicitacaoRepository.findById(id).get();
	}
	
	public Solicitacao salvar(Solicitacao solicitacao) {
		return solicitacaoRepository.save(solicitacao);
	}
	
	public void deletar(Integer id) {
		Solicitacao usuario = solicitacaoRepository.findById(id).get();
		
		solicitacaoRepository.delete(usuario);
	}
	public Solicitacao atualizarSolicitacaoParcial(Integer id, Solicitacao solicitacaoAtualizado) {
        Solicitacao solicitacaoExistente = solicitacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitacao não encontrada com AUTOID " + id));

        if (solicitacaoAtualizado.getNome() != null) {
            solicitacaoExistente.setNome(solicitacaoAtualizado.getNome());
        }
        if (solicitacaoAtualizado.getQuantidade() != null) {
            solicitacaoExistente.setQuantidade(solicitacaoAtualizado.getQuantidade());
        }
        if (solicitacaoAtualizado.getDimensao_xyz() != null) {
            solicitacaoExistente.setDimensao_xyz(solicitacaoAtualizado.getDimensao_xyz());
        }
        if (solicitacaoAtualizado.getDescricao() != null) {
            solicitacaoExistente.setDescricao(solicitacaoAtualizado.getDescricao());
        }
        if (solicitacaoAtualizado.getCor_id() != null) {
            solicitacaoExistente.setCor_id(solicitacaoAtualizado.getCor_id());
        }
        if (solicitacaoAtualizado.getFilamento_id() != null) {
            solicitacaoExistente.setFilamento_id(solicitacaoAtualizado.getFilamento_id());
        }
        if (solicitacaoAtualizado.getUsuario_id() != null) {
            solicitacaoExistente.setUsuario_id(solicitacaoAtualizado.getUsuario_id());
        }
        if (solicitacaoAtualizado.getImpressora_id() != null) {
            solicitacaoExistente.setImpressora_id(solicitacaoAtualizado.getImpressora_id());
        }
        if (solicitacaoAtualizado.getStatus_prioridade_id() != null) {
            solicitacaoExistente.setStatus_prioridade_id(solicitacaoAtualizado.getStatus_prioridade_id());
        }

        return solicitacaoRepository.save(solicitacaoExistente);
    }
}
