package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_terminal;

    private String nombre;
    private String ciudad;
}
