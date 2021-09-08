package matheus.AgendaWeb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int codigo;

    @Column(length = 50)
    @NonNull private String nome;

    @Column(length = 20)
    @NonNull private String telefone;

    @Column(length = 60, unique = true)
    @NonNull private String email;

    private String empresa;
}
