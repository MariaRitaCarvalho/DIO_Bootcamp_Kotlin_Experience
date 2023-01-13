package desafio.mediafinaldoaluno

fun main() {
  val media = readLine().toDouble()
  if (media < 5) {
    println("REP")
  } else if (media >= 5 && media < 7) {
    println("REC")
  } else (media > 7) {
    println("APR")
  }
}