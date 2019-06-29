package heranca;

public class Aluno extends Pessoa {
    
    private String matr;
    private String curso;


    public String status() {
        return "Aluno{" + "matr=" + matr + ", curso=" + curso + '}';
    }
    
    
    
    public void cancelarMatr(){
        System.out.println("Matrícila cancelada!!!");
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
