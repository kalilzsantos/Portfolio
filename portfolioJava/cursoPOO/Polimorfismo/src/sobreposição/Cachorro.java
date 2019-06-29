package sobreposição;

public class Cachorro extends Lobo {
    
    public void enterrarOssos(){
        
        System.out.println("Enterrando Ossos");
        
    }
    
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
    
}
