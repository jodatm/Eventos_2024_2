public class Cilindro extends Circulo{

    private float alto;

    public Cilindro(float radio, float alto){
        super(radio);
        this.alto = alto;
    }

    public float getArea(){
        return super.getArea() * alto;	
    }
    
}
