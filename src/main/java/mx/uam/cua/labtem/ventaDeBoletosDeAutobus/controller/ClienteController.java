package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Cliente;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }
}
