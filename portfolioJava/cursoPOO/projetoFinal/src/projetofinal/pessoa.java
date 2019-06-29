package projetofinal;

public abstract class pessoa {
    
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float exp;
    
    protected void ganharExp(){
        
    }

    public pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exp = 0;
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

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", exp=" + exp + '}';
    }
    
    
    
    
    
}
