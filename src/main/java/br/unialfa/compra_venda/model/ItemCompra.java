package br.unialfa.compra_venda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ItemCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Compra compra;

    @NotNull(message = "Informe a Quantidade do Item")
    private Integer quantidade;

    @NotNull(message = "Informe o Valor (R$) do Item")
    private Float valor;

    @NotBlank(message = "Informe a Descrição do Item")
    private String descricao;

}
