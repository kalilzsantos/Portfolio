package projetofinal;

public class gafanhoto extends pessoa{
    private String login;
    private float totAssistido;

    public gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(float totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public float getExp() {
        return exp;
    }

    @Override
    public void setExp(float exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}
