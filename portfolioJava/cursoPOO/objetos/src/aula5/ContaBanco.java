package aula5;
import java.util.Scanner;

public class ContaBanco {
    
    Scanner teclado;
    public int numConta;
    protected String tipo; 
    private String dono;
    private float saldo;        
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Sobre a conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Aberta: " + this.getStatus());
        System.out.println("---------------------------------------");
    } 

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }    
    
    public void abirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "cc"){
            this.setSaldo(50);
            System.out.println("Conta Corrente Aberta");
        }else if(tipo =="cp"){
            this.setSaldo(150);
            System.out.println("Conta Poupança Aberta");
        }
    }
    public void fecharConta(){
        if(this.getSaldo() == 0){
            System.out.println("Conta Fechada com sucesso!");
            this.setStatus(false);
        }else if(saldo > 0){
            System.out.println("A conta ainda tem saldo. Você deve sacar antes de fecha-la!");
        }else{
            System.out.println("Você ainda nos deve um valor. Você deve paga-lo antes de fechar a conta. Consulte Status.");
        }
        
    }
    public void depositar(float d){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Deposito realizado na conta do(a): "+ this.getDono());
        }else{
            System.out.println("Impossível Depositar");
        }
        
    }
    public void sacar(float s){
        if(this.getStatus()){
            if (this.getSaldo() >= s){
                this.setSaldo(this.getSaldo()-s);
                System.out.println("Saque realizado na conta do(a): " + this.getDono());
            }else{
                System.out.println("Saldo para saque insuficiente");
            }
            
        }else{
            System.out.println("Impossível Sacar");
        }
    }
    public void pagarMensal(float pag){
        float v = 0;
        if(this.getTipo() == "cc"){
            v=12;
            this.setSaldo(this.getSaldo()-v);
        }else if(this.getTipo() == "cp"){
            v=20;
            this.setSaldo(this.getSaldo()-v);
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossível pagar!");
        }
        
    }
    
    
    
    
    
    
    
    
}
