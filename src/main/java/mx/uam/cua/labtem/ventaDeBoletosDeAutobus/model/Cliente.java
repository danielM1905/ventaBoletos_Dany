package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;

    private String nombre;
    private String telefono;
    private String correo;
    private String password;
}
