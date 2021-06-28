package br.com.bytebank.modelo

class ContaCorrente(
    titular: br.com.bytebank.modelo.Cliente,
    numero: Int
) : br.com.bytebank.modelo.Conta(titular = titular, numero = numero) {

    override fun sacar(valorSaque: Double) {
        val valorComTaxa = valorSaque + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}