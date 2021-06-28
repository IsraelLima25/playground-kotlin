fun testaFuncionarios() {
    val israel = Gerente(nome = "Israel", cpf = "111.111.111-11", salario = 1000.00, senha = 123)

    println("nome ${israel.nome}")
    println("cpf ${israel.cpf}")
    println("salário ${israel.salario}")
    println("Bonificacao ${israel.bonificacao()}")

    val gerente = Gerente("Juca", "111.222.333-44", 3000.00, 1234)

    if (gerente.autentica(1234)) {
        println("Gerente autenticado")
        gerente.bonificacao()
    }

    val diretor = Diretor("Romeu", "333.888.000-11", 6000.00, 5555, 3000.00)

    if (diretor.autentica(5555)) {
        println("Diretor autenticado")
    }

    println("Gerente")
    println("------------------------------------")
    println("nome ${gerente.nome}")
    println("cpf ${gerente.cpf}")
    println("salário ${gerente.salario}")
    println("bonificação ${gerente.bonificacao()}")

    println("Diretor")
    println("------------------------------------")
    println("nome ${diretor.nome}")
    println("cpf ${diretor.cpf}")
    println("salário ${diretor.salario}")
    println("bonificação ${diretor.bonificacao()}")
    println("plr ${diretor.plr}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(diretor)
    calculadora.registra(gerente)

    println("total de bonificacao: ${calculadora.total}")
}
