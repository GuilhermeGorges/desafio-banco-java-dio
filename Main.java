public class Main {
    public static void main(String[] args) {

        Banco gui = new Banco();
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme");

        IConta cc = new ContaCorrente(guilherme);
        IConta cp = new ContaPoupanca(guilherme);

        cc.depositar(1000);
        cc.imprimirExtrato();
        cc.transferir(400, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //gui.mostrarClientes();

    }
}
