package br.edu.atitus.luiza_neckel.zoo_digital.animais;

public abstract class Reptil extends Animal {

    private boolean venenoso;

    public Reptil(String nome, int idade, boolean venenoso) {
        super(nome, "Réptil", idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void regularTemperatura() {
        System.out.println(getNome() + " está regulando a temperatura corporal.");
    }
}