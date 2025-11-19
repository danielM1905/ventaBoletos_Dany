package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Terminal;

public interface TerminalRepository extends JpaRepository<Terminal, Integer> {
}
