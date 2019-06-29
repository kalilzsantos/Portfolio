package sobrecarga;

public class Mamifero extends Animal {
    
    private String corPelo;

    @Override
    public void Locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void Alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}