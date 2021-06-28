import br.com.bytebank.exception.FalhaAutenticacaoException
import br.com.bytebank.exception.SaldoInsuficienteException
import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco
import java.lang.Exception

fun testaComportamentosConta() {

    val clienteIsrael =
        Cliente(nome = "Israel", cpf = "111.111.111-22", senha = 1234, endereco = Endereco("Rua alvorada"))
    val clienteFran = Cliente(nome = "Fran", cpf = "222.222.333-45", senha = 4321)

    val contaIsrael = ContaCorrente(titular = clienteIsrael, numero = 3463)
    contaIsrael.depositar(500.00)
    println("Endereço do titular ${clienteIsrael.endereco.logradouro}")
    // flexibilidade de ordem dos argumentos promovidas pelas labels do kotlin
    val contaFran = ContaPoupanca(numero = 1515, titular = clienteFran)
    contaFran.depositar(200.05)

    println(contaIsrael.titular.nome)
    println(contaIsrael.numero)
    println(contaIsrael.saldo)
    println("-----------------------------")
    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)
    println("-----------------------------")
    println("Depositando na conta da ${contaFran.titular.nome} R$ 300.000")
    contaFran.depositar(300.00)
    println("Novo saldo conta da Fran ${contaFran.saldo}")

    println("Sacando na conta do ${contaIsrael.titular.nome} R$ 500.000")
    contaIsrael.sacar(500.00)
    println("Novo saldo conta do ${contaIsrael.titular.nome} ${contaIsrael.saldo}")

    println("Saldo da conta da Fran ${contaFran.saldo}")

    println("Sacando com excessão da conta do Israel R$ 100.000")
    contaIsrael.sacar(100.00)
    println("Saldo da conta do Israel ${contaIsrael.saldo}")

    println("Transferindo R$ 100.000 da conta da Fran para a conta do Israel")
    try {
        contaFran.transferir(contaIsrael, 4321, 100.00)
        println("Transferência concluida com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        println("Autenticação inválida")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }


    println("Novo saldo da conta do Israel ${contaIsrael.saldo}")
    println("Novo saldo da conta da Fran ${contaFran.saldo}")
}