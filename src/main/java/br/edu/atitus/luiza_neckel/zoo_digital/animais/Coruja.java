package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Voador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Predador;

public class Coruja extends Ave implements Voador, Predador {

    public Coruja(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está corujando no topo do telhado.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um rato.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando lindamente.");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando insetos pela madrugada.");
	}
    
}