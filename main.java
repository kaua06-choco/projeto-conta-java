public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Kaua");

        conta.depositar(100);
        conta.sacar(40);

        System.out.println("Saldo: " + conta.getSaldo());
    }
}
