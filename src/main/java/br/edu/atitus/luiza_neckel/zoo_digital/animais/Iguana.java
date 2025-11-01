package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Corredor;

public class Iguana extends Reptil implements Nadador, Corredor {

	public Iguana(String nome, int idade, boolean venenoso) {
		super(nome, idade, false);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está chiando.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo uma planta.");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando fugindo dos predadores.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo dos predadores.");
    }
    
}
