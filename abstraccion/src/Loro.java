public class Loro extends Pajaro implements Mascota, AnimalDeCirco{

    private String idioma;
    private String raza;

    public Loro(String nombre, String colorPlumaje, String idioma,
    String raza) {
        super(nombre, colorPlumaje);
        this.idioma = idioma;
        this.raza = raza;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void cantar() {
        System.out.println("Quiere cacao!!!!");
    }

    @Override
    public String getDueño() {
        return "Señor Gustavo";
    }

    @Override
    public String getFechaDeVacunacion() {
        return "01/01/2025";
    }

    @Override
    public void hacerTruco() {
        System.out.println("Hablar");
    }

    @Override
    public void despedirse() {
        System.out.println("chao cacao");
    }
    
    


}
