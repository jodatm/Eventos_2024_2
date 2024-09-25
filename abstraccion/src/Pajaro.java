public abstract class Pajaro{

    private String nombre;
    private String ColorPlumaje;
    
    public Pajaro(String nombre, String colorPlumaje) {
        this.nombre = nombre;
        ColorPlumaje = colorPlumaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPlumaje() {
        return ColorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        ColorPlumaje = colorPlumaje;
    }

    public abstract void cantar();

}