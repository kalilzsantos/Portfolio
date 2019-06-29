package aula6;

public class controleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais

    controleRemoto() {
        volume = 50;
        ligado = true;
        tocando = false;
    }
    
    

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos abstratos
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("**** MENU ****");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i=0; i <= this.getVolume(); i+=10){
            System.out.print(" || ");
        }
        System.out.println("\n**** **** ****");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechado!");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossível aumentar o volume!!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume!!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }else {
            System.out.println("Impossível colocar no mudo!!");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()== 0){
            this.setVolume(50);
        }else {
            System.out.println("Impossível tirar do mudo!!");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else {
            System.out.println("Impossível dar play!!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Impossível pausar!!");
        }
    }

    private boolean getTocando(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
