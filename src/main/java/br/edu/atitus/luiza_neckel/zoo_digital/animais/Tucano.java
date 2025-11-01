package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Voador;

public class Tucano extends Ave implements Voador {

    public Tucano(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gorjeando do alto da árvore.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes do chão.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando lindamente.");
    }
}