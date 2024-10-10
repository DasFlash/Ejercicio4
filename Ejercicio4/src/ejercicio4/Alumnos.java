package ejercicio4;

import java.io.*;
import java.util.Scanner;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

class Alumno implements Serializable {
	
    int nia;
    String nombre;
    String apellidos;
    char genero;
    String fechaNacimiento;  
    String ciclo;
    String curso;
    String grupo;

    public Alumno(int nia, String nombre, String apellidos, char genero, String fechaNacimiento, String ciclo, String curso, String grupo) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciclo = ciclo;
        this.curso = curso;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "NIA: " + nia + "\nNombre: " + nombre + "\nApellidos: " + apellidos +
               "\nGénero: " + genero + "\nFecha de Nacimiento: " + fechaNacimiento +
               "\nCiclo: " + ciclo + "\nCurso: " + curso + "\nGrupo: " + grupo + "\n";
    }
}
