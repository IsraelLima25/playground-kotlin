package br.com.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun bonificacao(): Double {
        return salario * 0.3
    }
}