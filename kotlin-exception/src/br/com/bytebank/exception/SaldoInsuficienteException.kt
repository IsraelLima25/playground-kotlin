package br.com.bytebank.exception

import java.lang.Exception

class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)