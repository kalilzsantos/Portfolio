package aula9;
import java.util.Scanner;

public class Pessoa {
    Scanner teclado;
    
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    
    
    // metodos
    public void fazerAniv(String aniv){
        this.idade = this.idade + 1;
    }
    
    //metodos especiais

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
