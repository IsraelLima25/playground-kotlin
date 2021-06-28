package br.com.bytebank.modelo

class ContaPoupanca(
    titular: br.com.bytebank.modelo.Cliente,
    numero: Int
) : br.com.bytebank.modelo.Conta(titular = titular, numero = numero) {

    override fun sacar(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }
    }

}