public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String no, String na, int i, float a, float p, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = i;
        this.altura = a;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }
    //metodos
    public void apresentar(){
        System.out.println("Nome do Lutador: " + this.getNacionalidade());
        System.out.println("Nacionalidade do lutador: " + this.getNacionalidade());
        System.out. println("Idade: " + this.getIdade());
        System.out.println("Altura do lutador: " + this.getAltura());
        System.out.println("Peso do lutador" + this.getPeso());
        System.out.println("Categoria :" + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void Status(){
        System.out.println(getNome());
        System.out.println(" é um peso " + getCategoria());
        System.out.println("Ganhou " + getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates  ");
    }
    //metodos
    public void status(){

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria(); //toda vez que atualizar o peso automaticamente a categoria vai ser atualizada
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2f){
            this.categoria = "Invalido";
        } else if (this.getPeso()<=70.3f) {
            this.categoria = "Leve";
        } else if (this.getPeso()<=83.9f) {
            this.categoria = "Medio";
        }else if(this.getPeso()<=120.2f){
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int virotias) {
        this.vitorias = virotias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
