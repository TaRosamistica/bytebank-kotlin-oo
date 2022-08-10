package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente (
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Mossoro"
            )
        ),
        numero = 1000
    )

    println("titular${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço titular ${contaCorrente.titular.endereco.logradouro}")



    val contaPoupanca = ContaPoupanca(
        titular = Cliente (
            nome = "Fran",
            cpf = "",
            senha = 2),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)


    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque conta corrente: ${contaCorrente.saldo}")
    println("saldo após saque conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println(" ")

    println("saldo conta poupança após receber transferencia : ${contaPoupanca.saldo}")
    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")

    println(" ")
    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo conta corrente  após receber transferencia: ${contaCorrente.saldo}")
    println("saldo conta poupança após transferira para corrente : ${contaPoupanca.saldo}")
}