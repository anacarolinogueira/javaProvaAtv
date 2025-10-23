public class Principal {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumero_conta(2345);
        p1.setTitular("Jubileu");
        p1.setAbrirConta("CC");
        p1.estadoAtual();
        p1.Deposito(100);

        ContaBancaria p2 = new ContaBancaria();
        p1.setNumero_conta(2324982);
        p1.setTitular("Ana Julia");
        p1.setAbrirConta("CP");
        p1.Saque(50);
        p1.estadoAtual();
    }
}
