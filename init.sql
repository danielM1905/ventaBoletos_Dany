CREATE SCHEMA IF NOT EXISTS ventaBoletosDB;
USE ventaBoletosDB;

-- TABLA CLIENTES
CREATE TABLE IF NOT EXISTS clientes(
    id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    telefono VARCHAR(45) NOT NULL,
    correo VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_cliente)
) ENGINE=InnoDB;

INSERT INTO clientes (nombre, telefono, correo, password)
VALUES ('Jorge M', '1234567890', 'jorge@correo.com', '1234');

-- TABLA TERMINAL
CREATE TABLE IF NOT EXISTS terminal(
    id_terminal INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_terminal)
) ENGINE=InnoDB;

INSERT INTO terminal(nombre, ciudad)
VALUES('Terminal Norte', 'CDMX');

-- TABLA AUTOBUS
CREATE TABLE IF NOT EXISTS autobus(
    id_autobus INT NOT NULL AUTO_INCREMENT,
    modelo VARCHAR(50) NOT NULL,
    placas VARCHAR(40) NOT NULL,
    terminal_id INT NOT NULL,
    PRIMARY KEY(id_autobus),
    FOREIGN KEY (terminal_id) REFERENCES terminal(id_terminal)
) ENGINE=InnoDB;

INSERT INTO autobus(modelo, placas, terminal_id)
VALUES('Volvo 9800', 'ABC-123', 1);
