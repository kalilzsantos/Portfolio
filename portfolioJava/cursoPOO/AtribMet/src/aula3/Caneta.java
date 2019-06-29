
package aula3;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
        
    }
    
    public void escrever(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada!");
        }else{
            System.out.println("Escrevendo");
        }
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada!");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    public void pintar(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada!");
        }else{
            System.out.println("Pintando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
