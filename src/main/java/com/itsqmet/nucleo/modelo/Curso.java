package com.itsqmet.nucleo.modelo;



import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Curso  implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idCurso;
    private String cursoNombre;
    private String descripcion;
    private int creditos;

    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;

    @OneToMany(mappedBy = "curso")
    private List<Aula> aulas;
}
