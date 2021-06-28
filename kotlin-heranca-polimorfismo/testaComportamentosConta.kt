fun testaComportamentosConta() {

    val contaIsrael = ContaCorrente(titular = "Israel", numero = 3463)
    contaIsrael.depositar(500.00)
    // flexibilidade de ordem dos argumentos promovidas pelas labels do kotlin
    val contaFran = ContaPoupanca(numero = 1515, titular = "Fran")
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