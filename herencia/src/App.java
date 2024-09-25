public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.getArea());
        Cilindro cilindro = new Cilindro(6.7f, 8);
        System.out.println(cilindro.getArea());
    }
}
