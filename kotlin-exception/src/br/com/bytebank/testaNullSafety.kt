package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun nullSafety() {
    var endereco: Endereco? = Endereco(logradouro = "Alvorada")
    println(endereco?.logradouro?.length)

    endereco?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }
}
