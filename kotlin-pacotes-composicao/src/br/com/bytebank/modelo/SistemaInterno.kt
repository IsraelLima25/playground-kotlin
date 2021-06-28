package br.com.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication fail!")
        }
    }
}