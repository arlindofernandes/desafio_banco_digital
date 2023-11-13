public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        cc.depositar(100);
        poupanca.depositar(500);
        poupanca.transferir(cc, 300);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
