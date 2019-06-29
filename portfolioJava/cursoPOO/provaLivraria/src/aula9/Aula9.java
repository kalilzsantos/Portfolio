package aula9;


public class Aula9 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Aline", 22, "Feminino");
        p[1] = new Pessoa("Debora", 42, "Feminino");
        p[2] = new Pessoa("Kalil", 20, "Masculino");
        
        l[0] = new Livro("Aprendendo Java", "Guanabara", 500, p[2]);
        l[1] = new Livro("Aprendendo Ruby", "Guanabara", 400, p[1]);
        l[2] = new Livro("Aprendendo PHP", "Guanabara", 300, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(20);
        System.out.println(l[0].detalhes());
        
    }
    
}
