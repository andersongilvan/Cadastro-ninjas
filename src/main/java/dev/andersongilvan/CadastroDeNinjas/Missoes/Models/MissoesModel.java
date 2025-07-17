package dev.andersongilvan.CadastroDeNinjas.Missoes.Models;


import dev.andersongilvan.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    // Uma missao para muito ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
