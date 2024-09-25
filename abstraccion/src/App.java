import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Loro jaimito = new Loro("Jaimito", "Verde", "Español",
        "Colombiano");
        //Pajaro pajarito = new Pajaro("Pepito", "Amarillo");
        Torcaza camilita = new Torcaza("Jaimito", "Verde");        
        ArrayList <Pajaro> lista = new ArrayList<Pajaro>();
        lista.add(jaimito);
        lista.add(camilita);
        System.out.println("asi cantan los pajaros");
        for(Pajaro pajaro : lista) {
            pajaro.cantar();
        }
        Perro firulais = new Perro();
        ArrayList <Mascota> listaDeMascotas = new ArrayList<Mascota>();
        listaDeMascotas.add(jaimito);
        listaDeMascotas.add(firulais);
        for(Mascota mascota : listaDeMascotas) {
            System.out.println(mascota.getDueño());
            System.out.println(mascota.getFechaDeVacunacion());
        }
        Elefante elefante = new Elefante();
        ArrayList <AnimalDeCirco> listaDeAnimalesDeCirco = new ArrayList<AnimalDeCirco>();
        listaDeAnimalesDeCirco.add(jaimito);
        listaDeAnimalesDeCirco.add(elefante);
        for(AnimalDeCirco animal : listaDeAnimalesDeCirco) {
            animal.hacerTruco();
            animal.despedirse();
        }
    }
}
