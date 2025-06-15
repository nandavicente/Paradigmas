package estrategias

// Retorna uma nova lista contendo apenas os números pares da lista original
fun filtrarPares(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}
