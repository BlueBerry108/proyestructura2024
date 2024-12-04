
package Controlador;

public class Alumno {
    String nombres;
    String apellidop;
    String apellidom;
    int codigo;
    int[] notas;
    
    public Alumno(String nombres, String apellidop, String apellidom, int codigo) {
        this.nombres = nombres;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.codigo = codigo;
        this.notas= new int[5];
    }  
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidop=" + apellidop + ", apellidom=" + apellidom + ", codigo=" + codigo + '}'+"\t";
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    public String getNombreCompleto() {
        return nombres + " " + apellidop + " " + apellidom;
    }

    
    
    
}
