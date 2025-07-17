package dev.andersongilvan.CadastroDeNinjas.Ninjas.Model;


import dev.andersongilvan.CadastroDeNinjas.Missoes.Models.MissoesModel;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Entity
@Table(name = "tb_cadastro")
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
