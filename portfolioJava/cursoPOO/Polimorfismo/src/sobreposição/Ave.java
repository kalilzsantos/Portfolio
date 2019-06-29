package sobreposição;

public class Ave extends Animal {
    
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    public void Locomover() {
        System.out.println("Voando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aves!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
