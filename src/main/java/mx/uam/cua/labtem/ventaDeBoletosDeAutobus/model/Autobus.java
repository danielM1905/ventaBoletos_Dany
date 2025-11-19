package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Autobus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_autobus;

    private String modelo;
    private String placas;

    @ManyToOne
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;
}
