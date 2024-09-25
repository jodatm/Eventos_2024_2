public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "Del Valle";
        boolean voyAGanarEventos =  true;
        Humano humano1 = new Humano();
        humano1.setNombre("sofia");
        humano1.setEdad((byte)33);
        Humano humano2 = new Humano("joshua",(byte)20,"123456");
        System.out.println("Hola eventos!");
        System.out.println(humano2);
        System.out.println(humano2.getNombre());
        System.out.println(humano1.getNombre());
        System.out.println(humano1.getEdad());
        humano1.saludar();
        humano2.saludar();
        humano1.presentarse();
        humano2.presentarse();
        String estratoSofia = humano1.estrato(2000000);
        System.out.println(estratoSofia);
        //System.out.println(humano1.identificacion);
    }
}
