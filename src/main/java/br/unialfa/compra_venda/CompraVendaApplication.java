package br.unialfa.compra_venda;

import br.unialfa.compra_venda.model.Compra;
import br.unialfa.compra_venda.model.ItemCompra;
import br.unialfa.compra_venda.service.CompraService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CompraVendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompraVendaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CompraService compraService) {
        return args -> {
            var itemcompra = new ItemCompra(
                    null,
                    null,
                    10,
                    10F,
                    "Item A"
            );

            var compra = new Compra(
                    null,
                    "Fornecedor",
                    Arrays.asList(itemcompra));
            compraService.salvar(compra);

        };
    }
}
