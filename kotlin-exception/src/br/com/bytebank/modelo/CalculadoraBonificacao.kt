package br.com.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.bytebank.modelo.Funcionario) {
        this.total += funcionario.bonificacao()
    }
}