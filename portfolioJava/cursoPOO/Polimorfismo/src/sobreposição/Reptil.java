package sobreposição;

public class Reptil extends Animal {
    
    private String corEscama;
 

    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
