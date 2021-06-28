package br.com.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: br.com.bytebank.modelo.Endereco = br.com.bytebank.modelo.Endereco(),
    private val senha: Int
) : br.com.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return  true
        }
        return false
    }
}