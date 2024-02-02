package com.sefaz.pontoestagiario.features.pessoa.controller.impl;

import com.sefaz.pontoestagiario.features.pessoa.model.entity.Pessoa;
import com.sefaz.pontoestagiario.features.pessoa.service.impl.PessoaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController implements com.sefaz.pontoestagiario.features.pessoa.controller.PessoaController {

    private final PessoaServiceImpl pessoaServiceImpl;

    public PessoaController(PessoaServiceImpl pessoaServiceImpl) {
        this.pessoaServiceImpl = pessoaServiceImpl;
    }


    @Override
    @GetMapping
    public List<Pessoa> buscarTodasPessoas() {
        return pessoaServiceImpl.buscarTodasPessoas();
    }

    @Override
    @GetMapping("/{id}")
    public Pessoa buscarPessoaPorId(Long id) {
        return pessoaServiceImpl.buscarPessoaPorId(id);
    }

    @Override
    @PostMapping
    public Pessoa adicionarPessoa(Pessoa pessoa) {
        return pessoaServiceImpl.adicionarPessoa(pessoa);
    }

    @Override
    @PutMapping("/{id}")
    public Pessoa atualizarPessoa(Long id, Pessoa novaPessoa) {
        return pessoaServiceImpl.atualizarPessoa(id, novaPessoa);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deletarPessoa(Long id) {
        pessoaServiceImpl.deletarPessoa(id);
    }
}

/*
 @GetMapping
    public List<Pessoa> buscarTodasPessoas(){
        return pessoaService.buscarTodasPessoas();
    }

    @GetMapping("/{id}")
    public Pessoa buscarPessoaPorId(@PathVariable Long id) {
        return pessoaService.buscarPessoaPorId(id);
    }

    @PostMapping
    public Pessoa adicionarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.adicionarPessoa(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa novaPessoa) {
        return pessoaService.atualizarPessoa(id, novaPessoa);
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
    }
 */