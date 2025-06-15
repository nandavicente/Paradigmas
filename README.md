Atividade - Paradigmas de Programação

Linguagem utilizada - Kotlin

O objetivo da atividade é manipular listas em Kotlin usando diferentes estratégias. O programa permite aplicar as seguintes operações sobre uma lista de números:
- Ordenação crescente
- Ordenação decrescente
- Remoção de duplicatas
- Filtragem de números pares

Você pode compilar e executar o programa com os seguintes comandos (caso tenha o Kotlin instalado):
```bash
kotlinc Main.kt -include-runtime -d programa.jar
java -jar programa.jar

Filtragem numeros pares
lista.filter { it % 2 == 0 }:

O método filter percorre cada elemento da lista.

it % 2 == 0 é a condição que verifica se o número é par.

Apenas os números que satisfazem essa condição são mantidos na nova lista.

val numeros = listOf(1, 2, 3, 4, 5, 6)
val pares = filtrarPares(numeros)
println(pares) // Saída: [2, 4, 6]

🔧 Função: filtrarPares
Esta função recebe uma lista de números inteiros e retorna uma nova lista contendo apenas os números pares, ou seja, os múltiplos de 2.

📌 Objetivo:
Facilitar a manipulação de listas numéricas por meio da filtragem funcional, mantendo apenas os elementos que atendem à condição n % 2 == 0.


