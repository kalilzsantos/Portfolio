package herenca2;

public class Professor extends Pessoa {
    
    private String especial;
    private float salario;
    
    public void receberAum(float aum){
        this.salario += aum;
        
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
