package br.com.fpsaraiva.projetosb.controllers;

import br.com.fpsaraiva.projetosb.models.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {

    @GetMapping(path="/qualquer")
    public Cliente obterCliente() {
        return new Cliente(30, "Pedro", "000.000.000-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "111.111.000-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name="id") int id) {
        return new Cliente(id, "João", "222.222.000-00");
    }
}
