package modelo

import modelo.Funcionario

class Auxiliar (
        nome: String,
        cpf: String,
        salario: Double,
    )   : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
    ) {

        override val bonificacao: Double
            get(){
                //println("bonificação analista")
                return  salario * 0.05
            }
    }
