public class Estudiante <g,h>{
    private String nombre;
    private String codigo;
    private g estrato;
    private h cedula;
    private Programa programa;

    public Estudiante(String nombre, String codigo, Programa programa,
    g estrato, h cedula) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.programa = programa;
        this.estrato = estrato;
        this.cedula = cedula;
        programa.addEstudiante(this);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", codigo=" + codigo + ", estrato=" + estrato.getClass() + ", cedula=" + cedula.getClass()
                + ", programa=" + programa + "]";
    }

    public g getEstrato() {
        return estrato;
    }

    public void setEstrato(g estrato) {
        this.estrato = estrato;
    }

    public H getCedula() {
        return cedula;
    }

    public void setCedula(H cedula) {
        this.cedula = cedula;
    }

        

}
