class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero) {

    override fun sacar(valorSaque: Double) {
        val valorComTaxa = valorSaque + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}