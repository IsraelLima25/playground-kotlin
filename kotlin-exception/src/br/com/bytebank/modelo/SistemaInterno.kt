package br.com.bytebank.modelo

class SistemaInterno {

    fun entra(admin: br.com.bytebank.modelo.Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Welcome to Bytebank")
        } else {
            println("Authentication fail!")
        }
    }
}