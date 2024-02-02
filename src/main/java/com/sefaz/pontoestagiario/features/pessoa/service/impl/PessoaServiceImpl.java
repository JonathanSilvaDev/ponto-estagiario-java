package com.sefaz.pontoestagiario.features.pessoa.service.impl;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;
import com.sefaz.pontoestagiario.features.pessoa.model.repository.PessoaRepository;
import com.sefaz.pontoestagiario.features.pessoa.service.PessoaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    @Override
    public List<Pessoa> buscarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa buscarPessoaPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    @Override
    public Pessoa adicionarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa atualizarPessoa(Long id, Pessoa novaPessoa) {
        Pessoa pessoaExistente = pessoaRepository.findById(id).orElse(null);
        pessoaExistente.setNome(novaPessoa.getNome());

        if (novaPessoa.getAtivo() != null) {
            pessoaExistente.setAtivo(novaPessoa.getAtivo());
        }

        pessoaExistente.setEmail(novaPessoa.getEmail());
        pessoaExistente.setLogin(novaPessoa.getLogin());
        return pessoaRepository.save(pessoaExistente);
    }

    @Override
    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}

/*
  public List<Pessoa> buscarTodasPessoas(){
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPessoaPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public Pessoa adicionarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarPessoa(Long id, Pessoa novaPessoa) {
        Pessoa pessoaExistente = pessoaRepository.findById(id).orElse(null);
        if (pessoaExistente != null) {
            pessoaExistente.setNome(novaPessoa.getNome());
            // Verifica se novaPessoa.ativo não é nulo antes de definir
            if (novaPessoa.getAtivo() != null) {
                pessoaExistente.setAtivo(novaPessoa.getAtivo());
            }
            pessoaExistente.setEmail(novaPessoa.getEmail());
            pessoaExistente.setLogin(novaPessoa.getLogin());
            return pessoaRepository.save(pessoaExistente);
        }
        return null; // Pessoa não encontrada para atualizar
    }

    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
 */