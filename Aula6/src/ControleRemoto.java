public class ControleRemoto implements Controlador {
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer v) {
        this.volume = v;
    }

    private boolean getLigado() {//sempre que for boolean ele vai colocar o is
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

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
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Tocando? " + this.getTocando());
        /*for(int  i=0; i<= this.getVolume();i++){
            System.out.println("|");
        }*/

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu..");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligatMudo() {
        if (this.getLigado() & this.getVolume() >0){
            this.setVolume(0);
        }
    }

    @Override
    public void deligarMudo() {
        if(this.getLigado() && this.getVolume() ==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(true);
        }
    }
}
