package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Predador;

public class Jararaca extends Reptil implements Nadador, Predador {

	public Jararaca(String nome, int idade, boolean venenoso) {
		super(nome, idade, true);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está sibilando.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo um lagarto.");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando ligeiramente.");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um rato.");
	}
}
