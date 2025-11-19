package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Autobus;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Terminal;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.AutobusRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.TerminalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autobuses")
public class AutobusController {

    private final AutobusRepository autobusRepository;
    private final TerminalRepository terminalRepository;

    public AutobusController(AutobusRepository autobusRepository, TerminalRepository terminalRepository) {
        this.autobusRepository = autobusRepository;
        this.terminalRepository = terminalRepository;
    }

    @GetMapping
    public List<Autobus> getAll() {
        return autobusRepository.findAll();
    }

    @PostMapping
    public Autobus create(@RequestBody Autobus autobus) {
        // si el JSON incluye terminal con id, JPA lo manejará; validación mínima:
        if (autobus.getTerminal() != null && autobus.getTerminal().getId_terminal() != null) {
            Integer idT = autobus.getTerminal().getId_terminal();
            Terminal t = terminalRepository.findById(idT).orElse(null);
            autobus.setTerminal(t);
        }
        return autobusRepository.save(autobus);
    }

    @PutMapping("/{id}")
    public Autobus update(@PathVariable Integer id, @RequestBody Autobus autobus) {
        autobus.setId_autobus(id);
        return autobusRepository.save(autobus);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        autobusRepository.deleteById(id);
    }
}
