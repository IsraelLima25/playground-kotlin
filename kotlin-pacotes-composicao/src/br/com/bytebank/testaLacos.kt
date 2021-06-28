fun testaLacos() {
    for (i in 6 downTo 1 step 2) {
        val titular: String = "Israel $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("-------------------------------------")
    }
}