package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model.Autobus;

public interface AutobusRepository extends JpaRepository<Autobus, Integer> {
}
