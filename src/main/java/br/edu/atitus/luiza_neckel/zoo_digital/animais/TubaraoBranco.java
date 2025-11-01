package br.edu.atitus.luiza_neckel.zoo_digital.animais;

import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luiza_neckel.zoo_digital.comportamentos.Predador;

public class TubaraoBranco extends Peixe implements Nadador, Predador{

    public TubaraoBranco(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma raia.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando perigosamente.");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando focas.");
	}
}
