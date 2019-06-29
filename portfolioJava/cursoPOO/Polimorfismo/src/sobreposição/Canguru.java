package sobreposição;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Com filhote na bolsa");
    }
    
    @Override
    public void Locomover() {
        System.out.println("Saltitando");
    }
    
}
