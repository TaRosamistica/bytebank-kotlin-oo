package modelo

interface Autenticavel {

    fun autentica( senha: Int): Boolean {
        return true
    }

}