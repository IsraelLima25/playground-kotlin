package br.com.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val salario: Double,
    val cpf: String
) {
    abstract fun bonificacao(): Double
}