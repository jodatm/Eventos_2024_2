import java.util.ArrayList;

public class Programa {
    private final String nombre;
    private ArrayList <Estudiante<String,Integer>> estudiantes;

    

    public Programa(String nombre, ArrayList <Estudiante<String,Integer>> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList <Estudiante<String,Integer>> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList <Estudiante<String,Integer>> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Programa [nombre=" + nombre + "]";
    }

    
}
