


package aula5;


public class Aula5 {

    public static void main(String[] args) {
    
       ContaBanco c1 = new ContaBanco();
       c1.setNumConta(001);
       c1.setDono("Jubileu");
       c1.abirConta("cc");
       
       c1.depositar(300);

       c1.estadoAtual();       

       ContaBanco c2 = new ContaBanco();       
       c2.setNumConta(002);
       c2.setDono("Maria");
       c2.abirConta("cp");
       
       c2.depositar(500);
       c2.sacar(1000);
       
       

       c2.estadoAtual();
    }
    
}