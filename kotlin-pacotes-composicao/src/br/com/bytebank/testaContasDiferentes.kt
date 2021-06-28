import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val clienteIsrael = Cliente(nome = "Israel", cpf = "111.111.111-22", senha = 1234)
    val clienteFran = Cliente(nome = "Fran", cpf = "222.222.333-45", senha = 4321)

    val contaCorrente = ContaCorrente(titular = clienteIsrael, numero = 3206)
    val contaPoupanca = ContaPoupanca(titular = clienteFran, numero = 1566)

    println("Contas antes das operações")

    println("br.com.bytebank.br.com.bytebank.modelo.Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("br.com.bytebank.br.com.bytebank.modelo.Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)

    println("Fazendo depositos")
    contaCorrente.depositar(100.00)
    contaPoupanca.depositar(100.00)

    println("Estado das contas pós depositos")

    println("br.com.bytebank.br.com.bytebank.modelo.Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("br.com.bytebank.br.com.bytebank.modelo.Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)

    contaCorrente.sacar(50.00)
    contaPoupanca.sacar(50.00)

    println("Estado das contas pós saques")

    println("br.com.bytebank.br.com.bytebank.modelo.Conta corrente")
    println(contaCorrente.titular)
    println(contaCorrente.numero)
    println(contaCorrente.saldo)

    println("br.com.bytebank.br.com.bytebank.modelo.Conta poupança")
    println(contaPoupanca.titular)
    println(contaPoupanca.numero)
    println(contaPoupanca.saldo)
}
