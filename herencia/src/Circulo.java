public class Circulo{
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return (float)(radio * radio * Math.PI);
    }
    
}