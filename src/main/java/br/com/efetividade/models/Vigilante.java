package br.com.efetividade.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vigilantes")
public class Vigilante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome, guerra, matricula, escala, cpf, titularidade;

    private boolean ativo;

    public boolean comparar(Vigilante vigilante) {
        if ((this.matricula.equals(vigilante.getMatricula())) && (this.cpf.equals(vigilante.getCpf()))) {
            return true;
        } else {
            return false;
        }
    }
}