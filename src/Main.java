import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// A traves de array list
        List<Animal> tusAnimales = new ArrayList<>();
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());

        for (Animal animal : tusAnimales) {
             animal.hacerSonido();
        }


// A traves de arrays
        Animal[] misAnimales = new Animal[3];
        misAnimales[0] = new Perro();
        misAnimales[1] = new Gato();
        misAnimales[2] = new Animal();

       

        for (Animal cualquiera : misAnimales) {
            cualquiera.hacerSonido();
        }

    }

}
