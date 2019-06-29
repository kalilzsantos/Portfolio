package herenca2;

public class Aluno extends Pessoa {
    
    private int matr;
    private String curso;


    public String status() {
        return "Aluno{" + "matr=" + matr + ", curso=" + curso + '}';
    }
    
    public void pagarMensalidade(){
        
    }
    
    
    public void cancelarMatr(){
        System.out.println("Matrícila cancelada!!!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
