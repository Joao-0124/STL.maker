package com.maker.impressora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpressoraRepository extends JpaRepository<Impressora, Integer>{

}
