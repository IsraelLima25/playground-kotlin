fun main() {
    println("welcome to bytebank")

    val contaIsrael = Conta(titular = "Israel", numero = 3463)
    contaIsrael.depositar(500.00)
    // flexibilidade de ordem dos argumentos promovidas pelas labels do kotlin
    val contaFran = Conta(numero = 1515, titular = "Fran")
    contaFran.depositar(200.05)

    println(contaIsrael.titular)
    println(contaIsrael.numero)
    println(contaIsrael.saldo)
    println("-----------------------------")
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println("-----------------------------")
    println("Depositando na conta da Fran R$ 300.000")
    contaFran.depositar(300.00)
    println("Novo saldo conta da Fran ${contaFran.saldo}")

    println("Sacando na conta do Israel R$ 500.000")
    contaIsrael.sacar(500.00)
    println("Novo saldo conta do Israel ${contaIsrael.saldo}")

    println("Saldo da conta da Fran ${contaFran.saldo}")

    println("Sacando com excessão da conta do Israel R$ 100.000")
    contaIsrael.sacar(100.00)
    println("Saldo da conta do Israel ${contaIsrael.saldo}")

    println("Transferindo R$ 100.000 da conta da Fran para a conta do Israel")
    if (contaFran.transferir(contaIsrael, 100.00)) {
        println("Transferência concluida com sucesso")
    } else {
        println("Falha ao transferir o valor")
    }

    println("Novo saldo da conta do Israel ${contaIsrael.saldo}")
    println("Novo saldo da conta da Fran ${contaFran.saldo}")

}

class Conta(val titular: String, val numero: Int) {
    //    var titular: String = titular
//        private set
//    var numero: Int = numero
//        private set
    var saldo: Double = 0.0
        private set(valor) {
            if (valor >= 0.0) {
                field = valor
            }
        }

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    fun depositar(valorDepositado: Double) {
        this.saldo += valorDepositado
    }

    fun sacar(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }
    }

    fun transferir(destino: Conta, valorTransferencia: Double): Boolean {
        if (saldo >= valorTransferencia) {
            saldo -= valorTransferencia
            destino.depositar(valorTransferencia)
            return true
        }
        return false
    }

//    fun getTitular(): String {
//        return titular;
//    }
//
//    fun setTitular(titular: String) {
//        this.titular = titular
//    }
//
//    fun getNumero(): Int {
//        return numero
//    }
//
//    fun setNumero(numero: Int) {
//        this.numero = numero
//    }
//
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(saldo: Double) {
//        if (saldo > 0.0) {
//            this.saldo = saldo
//        }
//    }
}

fun testaLacos() {
    for (i in 6 downTo 1 step 2) {
        val titular: String = "Israel $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("-------------------------------------")
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}