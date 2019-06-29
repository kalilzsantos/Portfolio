package aula9;
import java.util.Scanner;

public class Livro implements Publicacao{
    
    Scanner tec;
    
    //Atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos
    

    public String detalhes() {
        return " Informações dos Livros:\n" + " Titulo = " + titulo + "\n Autor = " + autor + 
                "\n Total de Paginas = " + totPag + "\n Pagina Atual = " + pagAtual + "\n Está Aberto? "
                + aberto + "\n Leitor=" + leitor.getNome();
    }
    
    //metodos especiais

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }   


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    
    
    //metodos abstratos

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPag){
            System.out.println("Essa pagina não existe!!");
            this.pagAtual = 0;
        }else{
        this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.setTotPag(this.getTotPag()+1);
    }

    @Override
    public void voltarPag() {
        this.setTotPag(this.getTotPag()-1);
    }
    
}
