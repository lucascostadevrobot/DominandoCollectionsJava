package org.example;

public class Gato {
    private String nome;
    private int idade;
    private String cor;
    private String raca;

    public Gato() {
    }

    public Gato(String nome, int idade, String cor, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "ObjetoGato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
