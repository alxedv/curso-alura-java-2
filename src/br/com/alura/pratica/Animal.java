package br.com.alura.pratica;

public class Animal {
    public void emitirSom() {
        System.out.println("Estou emitindo som!");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }
}

class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miau miau miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando");
    }
}

class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
