package matheus.AgendaWeb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import matheus.AgendaWeb.domain.Pessoa;

public interface IPessoaRepositorio extends JpaRepository<Pessoa, Integer> {
    
}
