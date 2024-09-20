package com.itsqmet.nucleo.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name="db.Profesor")
public class Profesor implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column(name="nombreProfesor", length = 50)
    private String nombre;
    private String apellidoProfesor;
    private String correo;
    private String especializacion;
}
