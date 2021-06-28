package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Israel")
    banco.salva("Israel")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
            "Israel",
            "Matias",
            "Mateus",
            "Paulo",
            "João"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Israel? ${nomes.contains("Israel")}")
    println("Tamanho da coleção ${nomes.size}")
}