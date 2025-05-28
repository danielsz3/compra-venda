package br.unialfa.compra_venda.api;

import br.unialfa.compra_venda.model.Compra;
import br.unialfa.compra_venda.service.CompraService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/compra")
public class CompraApi {

    @Autowired
    private final CompraService compraService;

    @GetMapping
    public List<Compra> listarTodos() {
        return compraService.listarTodos();
    }

    @GetMapping("/{id}")
    public Compra listarPorId(@PathVariable Long id) {
        return compraService.buscarPorId(id);
    }

    @PostMapping
    public String salvar(@RequestBody Compra compra) {
        compraService.salvar(compra);
        return "Sucess";
    }

    @PutMapping
    public String alterar(@RequestBody Compra compra) {
        if (compra.getId() == null) return "Fail";
        compraService.salvar(compra);
        return "Sucess";
    }
}
