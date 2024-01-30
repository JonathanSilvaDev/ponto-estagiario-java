package com.sefaz.pontoestagiario.features.pessoa.model.repository;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
