package com.example.ex1;

public class Cachorro  implements Animal{
    @Override
    public String emitirSom() {
        return "Auau";
    }
    @Override
    public String comer() {
        return "Pedigre";
    }

}
