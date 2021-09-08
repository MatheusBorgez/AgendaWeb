package matheus.AgendaWeb.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import matheus.AgendaWeb.repositorio.IPessoaRepositorio;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaTestes {

    @Autowired
    private IPessoaRepositorio pessoaRepositorio;

    @Test
    public void Criar() {
        Pessoa pessoa = new Pessoa("Matheus", "(62) 996468116", "matheusab594@gmail.com");

        pessoaRepositorio.save(pessoa);
    }

}
