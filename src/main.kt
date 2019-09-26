fun main()
{
    val name = prompt("Name:")
    val n1 = prompt("No1: ")
    val n2 = prompt("No2: ")
    println("$name получает $n1 через $n2 лет")
}
// поскольку задача - просто вывести числа без операций над ними,
// везде используется string
fun prompt(p:String): String?
{
    print(p)
    return readLine()
}