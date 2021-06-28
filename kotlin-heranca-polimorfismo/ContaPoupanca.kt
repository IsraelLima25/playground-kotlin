class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero) {

    override fun sacar(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }
    }

}