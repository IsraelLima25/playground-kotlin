fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Israel", 3206)
    val contaPoupanca = ContaPoupanca("Fran", 1566)

    println("Contas antes das operações")

    println("Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)

    println("Fazendo depositos")
    contaCorrente.depositar(100.00)
    contaPoupanca.depositar(100.00)

    println("Estado das contas pós depositos")

    println("Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)

    contaCorrente.sacar(50.00)
    contaPoupanca.sacar(50.00)

    println("Estado das contas pós saques")

    println("Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)
}
