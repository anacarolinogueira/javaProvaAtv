public class ContaBancaria {
    public Integer numero_conta;
    protected String tipoConta;
    private String titular;
    private Double saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("numero_conta: " + numero_conta);
        System.out.println("tipoConta: " + tipoConta);
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
        System.out.println("status: " + status);
    }

    public ContaBancaria() {
        this.saldo = 0.00;
        this.status = false;
    }

    public Integer getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(Integer n) {
        this.numero_conta = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String T) {
        this.tipoConta = T;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String ti) {
        this.titular = ti;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }

    public void setAbrirConta(String t) {
        setTipoConta(t);
        setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50.00);
        } else if (t.equals("CP")) {
            setSaldo(150.00);
        } else {
            System.out.println("Tipo de Conta Invalido");
        }
    }

    public void Deposito(double valor) {
        if(getStatus()) {
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Você ainda não possui uma conta");
        }
    }
    public void Saque(double valor) {
        if(getStatus()) {
            if(getSaldo() <0) {
                System.out.println("Saldo negativo");
            }else{
                setSaldo(getSaldo() - valor);
            }
        }else{
            System.out.println("Você ainda não possui uma conta");
        }
    }

    public void FecharConta(boolean status) {
        if (saldo > 0) {
            System.out.println("Você ainda possui dinheiro na conta, saque ele");
        } else if (saldo < 0) {
            System.out.println("Sua conta está negativada");
        }else{
            System.out.println("Conta fechada.");
            setStatus(false);
        }
    }

    public void pagarMensalidade(double mensalidade) {
        if(getStatus()) {
            if(getSaldo() > mensalidade) {
                setSaldo(getSaldo() - mensalidade);
            }else{
                System.out.println("Saldo negativo");
            }
        }
    }
}

