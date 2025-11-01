package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Predador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Corredor;

public class Jacare extends Reptil implements Nadador, Predador, Corredor {

	public Jacare(String nome, int idade, boolean venenoso) {
		super(nome, idade, false);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rugindo.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo um peixe enorme.");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando sorrateiramente.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da presa.");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando uma capivara na beira do lago.");
	}
}
