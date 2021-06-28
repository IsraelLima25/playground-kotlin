package br.com.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : br.com.bytebank.modelo.Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun bonificacao(): Double {
        return salario * 0.5 + plr
    }

}