package proyectofinal;

import Controlador.Alumno;
import Controlador.Curso;
import Controlador.Lista;
import Controlador.nodo;

public class ProyectoFinal {
    public static Lista<Alumno> alumnos = new Lista<>(); // Lista de todos los alumnos
    public static Lista<Curso> cursitos = new Lista<>(); // Lista de todos los cursos

    // Método estático para inicializar datos
    public static void inicializarDatos() {
        // Crear listas de alumnos por curso
        Lista<Alumno> materiabiologia = new Lista<>();
        Lista<Alumno> materiamatematica = new Lista<>();

        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Juan", "Perez", "Lopez", 1001);
        Alumno alumno2 = new Alumno("Maria", "Gomez", "Diaz", 1002);
        Alumno alumno3 = new Alumno("Luis", "Santos", "Hernandez", 1003);

        // Agregar alumnos a la lista general
        alumnos.InsertarFinal(alumno1);
        alumnos.InsertarFinal(alumno2);
        alumnos.InsertarFinal(alumno3);

        // Crear cursos y asignar alumnos
        Curso biologia = new Curso("Biología", materiabiologia);
        Curso matematicas = new Curso("Matemáticas", materiamatematica);

        biologia.Agregaralumnosdelcurso(alumno1);
        biologia.Agregaralumnosdelcurso(alumno2);
        matematicas.Agregaralumnosdelcurso(alumno3);

        // Agregar cursos a la lista general de cursos
        cursitos.InsertarFinal(biologia);
        cursitos.InsertarFinal(matematicas);
    }

    public static void main(String[] args) {
        // Inicializar datos
        inicializarDatos();

        // Mostrar datos en consola (opcional, para verificar)
        System.out.println("Lista de alumnos:");
        alumnos.Mostrar();

        System.out.println("\nLista de cursos:");
        cursitos.Mostrar();

        System.out.println("\nAlumnos en Biología:");
        cursitos.inicio.dato.getAlumnosdelcurso().Mostrar();

        System.out.println("\nAlumnos en Matemáticas:");
        cursitos.fin.dato.getAlumnosdelcurso().Mostrar();
    }
    
    
    public static boolean existeAlumno(String codigo){
        nodo<Alumno> actual = alumnos.inicio;
        while(actual !=null){
            if(String.valueOf(actual.dato.getCodigo()).equals(codigo)){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    
    public static Alumno encontrarAlumno(String codigo,String nombre){
        nodo<Alumno> actual = encontrarCurso(nombre).alumnosdelcurso.inicio;
   
        
            while(actual !=null){
            if(String.valueOf(actual.dato.getCodigo()).equals(codigo)){
                return actual.dato;
            }
            
            actual = actual.siguiente;
        
        }
        return null;
    }
     public static Curso encontrarCurso(String nombre){
        nodo<Curso> actual = cursitos.inicio;
        
        while(actual !=null){
            if(actual.dato.getCursos().equals(nombre)){
                return actual.dato;
            }
           
            actual = actual.siguiente;
        }
        return null;
    }
     
     public  static void agregarNotaAlumno (String codigoA,String nombreC,int nota1,int nota2,int nota3,int nota4){
       
        
       
        double promedio=0;   
        int notas[]= new int[5];
        for(int i =0; i<=3;i++){
            switch(i){
                case 0: notas[i]=nota1;break;
                case 1: notas[i]=nota2;break;
                case 2: notas[i]=nota3;break;
                case 3: notas[i]=nota4;break;
                
            }
            promedio+=notas[i];
        }
        
        
        promedio = Math.round((promedio / 4) * 100.0) / 100.0;
        notas[4]=(int)promedio;
         encontrarAlumno(codigoA, nombreC).setNotas(notas);
    }
     
}
