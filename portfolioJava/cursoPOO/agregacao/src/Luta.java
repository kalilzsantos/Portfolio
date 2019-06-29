import java.util.Random;


public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos
    public void marcarLuta(Lutador L1, Lutador L2) {
        if((L1.getCategoria() == L2.getCategoria()) && (L1!=L2)){
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void Lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
             System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3);
            System.out.println("\n===== RESULTADO DA LUTA =====\n");
            switch(vencedor){
                case 0: //empate
                    System.out.println("    EMPATE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado ganha
                    System.out.printf("     Vitória de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante ganha
                    System.out.println("     Vitória de " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("\n=============================");
            
            
        }else{
            System.out.println("Luta não pode acontecer!!!");
        }
        
    }
    
    // metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}