abstract class Conta(val titular: String, val numero: Int) {

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
}