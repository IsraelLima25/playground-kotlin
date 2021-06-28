package br.com.bytebank.modelo

import br.com.bytebank.exception.FalhaAutenticacaoException
import br.com.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    val titular: br.com.bytebank.modelo.Cliente,
    val numero: Int
) : br.com.bytebank.modelo.Autenticavel by titular {

    var saldo: Double = 0.0
        protected set(valor) {
            if (valor >= 0.0) {
                field = valor
            }
        }

    fun depositar(valorDepositado: Double) {
        this.saldo += valorDepositado
    }

//    override fun autentica(senha: Int): Boolean {
//        return titular.autentica(senha)
//    }

    abstract fun sacar(valorSaque: Double)

    fun transferir(destino: br.com.bytebank.modelo.Conta, senha: Int, valorTransferencia: Double) {
        if (saldo < valorTransferencia) {
            throw SaldoInsuficienteException()
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        saldo -= valorTransferencia
        destino.depositar(valorTransferencia)
    }

    /* Contador privado e restrito a classe, ou seja, nenhuma subclasse consegue ter acesso */
    companion object Contador {
        var total = 0
            private set
    }
}