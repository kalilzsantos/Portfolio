package sobreposição;

public class Peixe extends Animal{
    
    private String corEscama;
    
    public void soltarBolhas(){
        
    }
    

    @Override
    public void Locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixes!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
