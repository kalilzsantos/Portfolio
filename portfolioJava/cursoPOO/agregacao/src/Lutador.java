public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
    
    public void apresentar(){
        System.out.println("\n*________________________________________________*");
        System.out.printf("  Lutador: " + this.getNome());
        System.out.printf(",\n  Nacionalidade: " + this.getNacionalidade());
        System.out.printf(",\n  Idade: " + this.getIdade());
        System.out.printf(",\n  Altura: " + this.getAltura());
        System.out.printf(",\n  Peso: " + this.getPeso());
        System.out.printf(",\n  Numero de vitórias: " + this.getVitoria());
        System.out.printf(",\n  Numero de derrotas: " + this.getDerrota());
        System.out.printf(",\n  Numero de empates: " + this.getEmpate());
        System.out.println("\n*________________________________________________*");
        
    }
    
    public void status(){
        System.out.println("*________________________________________________*");
        System.out.printf("  " + this.getNome() + " é um lutador peso " + this.getCategoria());
        System.out.printf(",  \n  Ele acumula " + this.getVitoria() + " vitórias");
        System.out.printf(",  \n  Ele acumula " + this.getDerrota() + " derrotas");
        System.out.printf(",  \n  Ele acumula " + this.getEmpate() + " empates.\n");
        System.out.println("*________________________________________________*");
        
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);
        
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
        
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
        
    }
    
            
}
