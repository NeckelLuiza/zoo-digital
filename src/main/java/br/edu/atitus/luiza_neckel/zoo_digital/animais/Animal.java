package br.edu.atitus.luiza_neckel.zoo_digital.animais;

public abstract class Animal {
    private static int contador=0;
    private int id;     

    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;

        Animal.contador++;       
        this.id = Animal.contador; 
    }

    public static int getContador(){
        return contador;
    }

    public int getId() {         
        return id;
    }
    
    public abstract void emitirSom();
    public abstract void comer();

    public final String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
