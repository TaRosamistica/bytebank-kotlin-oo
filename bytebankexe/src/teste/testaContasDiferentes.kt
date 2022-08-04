package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
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