package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Corredor;

public class Hipopotamo extends Mamifero implements Nadador, Corredor {

	public Hipopotamo(String nome, int idade) {
		super(nome, idade, false);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está roncando enquanto abana as orelhas.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo uma melancia");
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está submerso dormindo.");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo agresivamento atrás do jacaré.");
	}
}
