package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Predador;

public class DragaoDeKomodo extends Reptil implements Nadador, Corredor, Predador {

	public DragaoDeKomodo(String nome, int idade, boolean venenoso) {
		super(nome, idade, true);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rugindo.");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo carniça.");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando profundamente.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo caçando.");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um veado.");
	}
    
}

