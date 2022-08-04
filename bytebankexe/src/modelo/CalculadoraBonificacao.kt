package modelo

import modelo.Funcionario

class calculadoraBonificacao {

    var total: Double = 0.0
        private set


    fun registra (funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}