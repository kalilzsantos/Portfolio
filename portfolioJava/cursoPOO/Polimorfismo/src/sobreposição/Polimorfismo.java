package sobreposição;

public class Polimorfismo {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Lobo p = new Lobo();
        Ave a = new Ave();
        
        m.setPeso(85.2f);
        m.setIdade(8);
        m.setMembros(4);
        m.Locomover();
        m.Alimentar();
        m.emitirSom();
        System.out.println(m.toString());
        System.out.println("\n\n");
        
        c.setPeso(8.2f);
        c.setIdade(7);
        c.setMembros(4);
        c.Locomover();
        c.Alimentar();
        c.emitirSom();
        System.out.println(c.toString());
        System.out.println("\n\n");
        
        p.setPeso(5.2f);
        p.setIdade(6);
        p.setMembros(4);
        p.Locomover();
        p.Alimentar();
        p.emitirSom();
        System.out.println(p.toString());
        System.out.println("\n\n");
        
        

        
    }
    
}
