package br.com.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {

    var saldo: Double = 0.0
        protected set(valor) {
            if (valor >= 0.0) {
                field = valor
            }
        }

    fun depositar(valorDepositado: Double) {
        this.saldo += valorDepositado
    }


    abstract fun sacar(valorSaque: Double)

    fun transferir(destino: Conta, valorTransferencia: Double): Boolean {
        if (saldo >= valorTransferencia) {
            saldo -= valorTransferencia
            destino.depositar(valorTransferencia)
            return true
        }
        return false
    }

    /* Contador privado e restrito a classe, ou seja, nenhuma subclasse consegue ter acesso */
    companion object Contador {
        var total = 0
            private set
    }
}