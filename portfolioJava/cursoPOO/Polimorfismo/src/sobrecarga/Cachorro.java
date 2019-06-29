package sobrecarga;

public class Cachorro extends Lobo {
    
    @Override
    public void enterrarOssos(){
        
        System.out.println("Enterrando Ossos");
        
    }
    
    @Override
    public void abanarRabo(){
        
        System.out.println("Abanando o rabo");
        
    }
    
    @Override
    public void Locomover() {
        System.out.println("Correndo nas 4 patas");
    }
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU AU");
    }
    
    public void reagir(String frase) {
        if(frase == "Olá"){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        if(hora <= 12){
            System.out.println("Abanar");
        }else if(hora >=18){
            System.out.println("ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono) {
        if(dono == true){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso) {
        if (idade <5){
            if(peso < 10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso>10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
            
        }
    }
    
    
    
}