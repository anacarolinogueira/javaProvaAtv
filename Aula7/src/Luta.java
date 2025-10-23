//agregaçao
public class Luta{
    private Lutador desafiado; //desafiado é um  lutador desafiado vai ser um objeto do lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador da) {
        this.desafiante = da;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //metodo
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 !l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
            //uma classe é a instancia de um objeto

        }
    }
    public void lutar(){

    }

}
