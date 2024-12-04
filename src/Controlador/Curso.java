
package Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Curso {
    public String cursos;
    public Lista <Alumno> alumnosdelcurso;//el curso se crea con una lista que tendra a los alumnos
   

    public Curso(String cursos, Lista<Alumno> alumnosdelcurso) {
        this.cursos = cursos;
        this.alumnosdelcurso = alumnosdelcurso;
      
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public Lista<Alumno> getAlumnosdelcurso() {
        return alumnosdelcurso;
    }

    public void setAlumnosdelcurso(Lista<Alumno> alumnosdelcurso) {
        this.alumnosdelcurso = alumnosdelcurso;
    }
    
    public void Agregaralumnosdelcurso(Alumno alumnonuevo){
        alumnosdelcurso.InsertarFinal(alumnonuevo);
    }
    
    public void Eliminaralumnosdelcurso(int indice){
        alumnosdelcurso.Eliminar(indice);
    }

    @Override
    public String toString() {
        return "Curso{" + "cursos=" + cursos + '}';
    }
    
 
    
   
    
}
