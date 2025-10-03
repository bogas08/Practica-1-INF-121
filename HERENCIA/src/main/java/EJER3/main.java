package EJER3;
public class main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Leon("Simba", 5),
            new Pinguino("Pingu", 3),
            new Canguro("Jack", 4)
        };
        
        for(Animal animal : animales) {
            animal.desplazarse();
        }
    }
}