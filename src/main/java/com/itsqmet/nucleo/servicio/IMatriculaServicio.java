package com.itsqmet.nucleo.servicio;

import com.itsqmet.nucleo.modelo.Matricula;

import java.util.List;

public interface IMatriculaServicio {
    // Método para insertar una nueva matrícula
    public void insertarMatricula(Matricula nuevaMatricula);

    // Método para listar todas las matrículas
    public List<Matricula> listarMatriculas();

    // Método para obtener una matrícula por su ID
    public Matricula obtenerMatriculaPorId(Long id);

    // Método para actualizar los datos de una matrícula
    public void actualizarMatricula(Matricula matriculaActualizada);

    // Método para eliminar una matrícula por su ID
    public void eliminarMatricula(Long id);
}
