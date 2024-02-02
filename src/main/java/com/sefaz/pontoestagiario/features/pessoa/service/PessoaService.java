package com.sefaz.pontoestagiario.features.pessoa.service;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;

import java.util.List;

public interface PessoaService {

    public List<Pessoa> buscarTodasPessoas();

    public Pessoa buscarPessoaPorId(Long id);

    public Pessoa adicionarPessoa(Pessoa pessoa);

    public Pessoa atualizarPessoa(Long id, Pessoa novaPessoa);

    public void deletarPessoa(Long id);
}
