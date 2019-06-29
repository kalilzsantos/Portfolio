package aula3;

public class Aula3 {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(); // Estanciando o código, estou chamando a class
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
