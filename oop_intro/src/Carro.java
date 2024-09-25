public class Carro {
    private String marca;
    private short cilindraje;
    private byte numeroPasajeros;
    private boolean gobierno;

    public Carro(String marca, short cilindraje, byte numeroPasajeros, boolean gobierno) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.numeroPasajeros = numeroPasajeros;
        this.gobierno = gobierno;
    }

    public boolean isGobierno() {
        return gobierno;
    }

    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        this.cilindraje = cilindraje;
    }

    public byte getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(byte numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    
}
