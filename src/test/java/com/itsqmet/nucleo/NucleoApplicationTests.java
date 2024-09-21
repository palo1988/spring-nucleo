package com.itsqmet.nucleo;

import com.itsqmet.nucleo.modelo.*;
import com.itsqmet.nucleo.servicio.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NucleoApplicationTests {
/*
	@Autowired
	private ICursoServicio cursoServicio;

	@Autowired
	private IAulaServicio aulaServicio;

	@Autowired
	private IEstudianteServicio estudianteServicio;

	@Autowired
	private IMatriculaServicio matriculaServicio;

	@Autowired
	private IProfesorServicio profesorServicio;*/

	@Test
	void contextLoads() {
	/*	// Inserción de Curso
		Curso curso = new Curso();
		curso.setCursoNombre("Matemáticas");
		curso.setDescripcion("Curso de álgebra avanzada");
		curso.setCreditos(4);
		cursoServicio.insertarCurso(curso);

		// Inserción de Profesor
		Profesor profesor = new Profesor();
		profesor.setNombre("Carlos");
		profesor.setApellidoProfesor("Rodríguez");
		profesor.setCorreo("carlos.rodriguez@example.com");
		profesor.setEspecializacion("Matemáticas");
		profesorServicio.insertarProfesor(profesor);

		// Inserción de Estudiante
		Estudiante estudiante = new Estudiante();
		estudiante.setNombreEstudiante("Juan");
		estudiante.setApellidoEstudiante("Pérez");
		estudiante.setFechaNacimiento("2000-05-12");
		estudiante.setCorreo("juan.perez@example.com");
		estudianteServicio.insertarEstudiante(estudiante);

		// Inserción de Aula
		Aula aula = new Aula();
		aula.setNombreAula("Aula 101");
		aula.setCapacidad("50");
		aula.setCurso(curso); // Relacionar con el curso previamente creado
		aulaServicio.insertarAula(aula);

		// Inserción de Matricula
		Matricula matricula = new Matricula();
		matricula.setNombre("Matricula Juan Pérez");
		matricula.setFkMatricula(estudiante); // Relacionar con el estudiante previamente creado
		matricula.setCurso(curso); // Relacionar con el curso previamente creado
		matriculaServicio.insertarMatricula(matricula);*/
	}
}

