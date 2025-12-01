package com.maker.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarTodas(){
		return usuarioRepository.findAll();
	}
	
	public Usuario autenticar(String email, String senha) {
        return usuarioRepository
                .findByEmailAndSenha(email, senha)
                .orElse(null);
    }
	
	public Usuario buscarPorId(Integer id){
		return usuarioRepository.findById(id).get();
	}
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deletar(Integer id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		
		usuarioRepository.delete(usuario);
	}
    public Usuario atualizarUsuario(Integer id, Usuario usuarioAtualizado) {
    	Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com AUTOID " + id));
    	usuarioExistente.setUsuario(usuarioAtualizado.getUsuario());
        usuarioExistente.setMatricula(usuarioAtualizado.getMatricula());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setNome(usuarioAtualizado.getNome());
        usuarioExistente.setSenha(usuarioAtualizado.getSenha());
        usuarioExistente.setPerfil_id(usuarioAtualizado.getPerfil_id());
        return usuarioRepository.save(usuarioExistente);
        
    }
    
    public Usuario atualizarUsuarioParcial(Integer id, Usuario usuarioAtualizado) {
        Usuario usuarioExistente = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado com AUTOID " + id));
        if (usuarioAtualizado.getUsuario() != null) {
            usuarioExistente.setUsuario(usuarioAtualizado.getUsuario());
        }
        if (usuarioAtualizado.getMatricula() != null) {
            usuarioExistente.setMatricula(usuarioAtualizado.getMatricula());
        }
        if (usuarioAtualizado.getEmail() != null) {
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        }
        if (usuarioAtualizado.getNome() != null) {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
        }
        if (usuarioAtualizado.getSenha() != null) {
            usuarioExistente.setSenha(usuarioAtualizado.getSenha());
        }
        if (usuarioAtualizado.getPerfil_id() != null) {
            usuarioExistente.setPerfil_id(usuarioAtualizado.getPerfil_id());
        }

        return usuarioRepository.save(usuarioExistente);
    }

				
}
