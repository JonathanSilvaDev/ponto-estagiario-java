package com.sefaz.pontoestagiario.features.pessoa.service;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;
import com.sefaz.pontoestagiario.features.pessoa.model.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


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
}
