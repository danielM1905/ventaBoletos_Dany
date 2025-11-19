package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Terminal;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.TerminalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terminales")
public class TerminalController {

    private final TerminalRepository terminalRepository;

    public TerminalController(TerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    @GetMapping
    public List<Terminal> getAll() {
        return terminalRepository.findAll();
    }

    @PostMapping
    public Terminal create(@RequestBody Terminal terminal) {
        return terminalRepository.save(terminal);
    }

    @PutMapping("/{id}")
    public Terminal update(@PathVariable Integer id, @RequestBody Terminal terminal) {
        terminal.setId_terminal(id);
        return terminalRepository.save(terminal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        terminalRepository.deleteById(id);
    }
}
