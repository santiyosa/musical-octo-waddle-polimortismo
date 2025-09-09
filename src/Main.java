public class Main {
    public static void main(String[] args) {
        
        Animal[] misAnimales = new Animal[3];
        
        misAnimales[0] = new Perro();
        misAnimales[1] = new Gato();
        misAnimales[2] = new Animal(); 

        for (Animal cualquiera : misAnimales) {
            cualquiera.hacerSonido();
        }

    }
    
}

