package com.maker.usuario;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // 👇 novo método
    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
