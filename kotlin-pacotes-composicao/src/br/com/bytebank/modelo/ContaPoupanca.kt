package br.com.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(titular = titular, numero = numero) {

    override fun sacar(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }
    }

}