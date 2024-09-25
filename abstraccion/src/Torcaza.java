public class Torcaza extends Pajaro{

    public Torcaza(String nombre, String colorPlumaje) {
        super(nombre, colorPlumaje);
        
    }

    @Override
    public void cantar() {
        System.out.println("Cuchicuchi");
    }
    
}
