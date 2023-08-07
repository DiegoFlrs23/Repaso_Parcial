package Herencia;

public class Estudiante extends Persona {
    public int codigoEstudiante;
    public float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int CodigoEstudiante, float NotaFinal){
        super (nombre,apellido,edad);
        this.codigoEstudiante = CodigoEstudiante;
        this.notaFinal = NotaFinal;
    }    

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo de estudiante:"+getCodigoEstudiante()+
                "\nNota final: "+getNotaFinal());
    }
    
}
