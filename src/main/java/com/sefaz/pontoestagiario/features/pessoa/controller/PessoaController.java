package com.sefaz.pontoestagiario.features.pessoa.controller;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public interface PessoaController {
    public List<Pessoa> buscarTodasPessoas();

    public Pessoa buscarPessoaPorId(@PathVariable Long id);

    public Pessoa adicionarPessoa(@RequestBody Pessoa pessoa);

    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa novaPessoa);

    public void deletarPessoa(@PathVariable Long id);
}
