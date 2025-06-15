package main

import estrategias.*  // Importa todas as estratégias implementadas no pacote

// Função de ordem superior que recebe uma lista e uma estratégia de manipulação
fun executarEstrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}

fun main() {
    val lista = listOf(4, 3, 2, 5, 7, 1)  // Lista de exemplo

    // Aplica a estratégia de ordenação crescente
    val resultado = executarEstrategia(lista, ::ordenarCrescente)

    println("Resultado: $resultado")
}

