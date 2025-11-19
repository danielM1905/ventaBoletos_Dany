package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
