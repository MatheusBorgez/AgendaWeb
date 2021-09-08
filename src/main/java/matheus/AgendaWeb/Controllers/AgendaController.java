package matheus.AgendaWeb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import matheus.AgendaWeb.domain.Pessoa;
import matheus.AgendaWeb.repositorio.IPessoaRepositorio;

@RestController
@RequestMapping("/")
public class AgendaController {

    @Autowired
    private IPessoaRepositorio pessoaRepositorio;

    @PostMapping("/inserir")
    public Pessoa InsiraPessoa(@RequestBody Pessoa pessoa) {

        return pessoaRepositorio.save(pessoa);
    }

    @GetMapping("/")
    public List<Pessoa> ObtenhaPessoas() {

        return pessoaRepositorio.findAll();
    }

    @PutMapping("/alterar")
    public Pessoa AleterePessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepositorio.save(pessoa);
    }


    @DeleteMapping("/{codigo}")
    public void DeletePessoa(@PathVariable int idPessoa) {
        pessoaRepositorio.deleteById(idPessoa);
    }

}
