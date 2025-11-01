package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Corredor;

public class Elefante extends Mamifero implements Nadador, Corredor {

	public Elefante(String nome, int idade) {
		super(nome, idade, true);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está bramando alto.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo frutinhas e folhas.");
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando com a tromba para fora.");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo furioso atrás dos turistas.");
	}
}
