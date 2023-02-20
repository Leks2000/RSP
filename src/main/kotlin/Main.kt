fun main() {
    println("Игра Камень-Ножницы-Бумага")
    while(true) {
        println(
            "Напишите цифру:\n" +
            "1 - Камень; \n"+
            "2 - Ножницы; \n" +
            "3 - Бумага; \n"
        )
        val list: List<String> = listOf("Камень", "Ножницы", "Бумага")
        print("Цифра: ")
            val player: Int = readln().toInt()
            if (player == 100) break
            val bot: Int = (1..3).random()
            println("Вы выбрали: ${list[player-1]}\nБот выбрал: ${list[bot-1]} ")
            println("${result(player, bot, list[player-1], list[bot-1])}\n")
    }
}

fun result(player: Int, bot: Int, choisePlayer: String, listBot: String): String {
    when(player){
        1 ->
            when(bot) {
                2 -> return "$choisePlayer побеждает $listBot\nВы победили!!!\n"
                3 -> return "$choisePlayer проигрывaет $listBot\nВы проиграли!!!\n"
            }
        2 ->
            when(bot) {
                1 -> return "$choisePlayer проигрывaют $listBot\nВы проиграли!!!"
                3 -> return "$choisePlayer побеждают $listBot\nВы победили!!!"
            }
        3 ->
            when(bot) {
                1 -> return "$choisePlayer побеждает $listBot\nВы победили!!!"
                2 -> return "$choisePlayer проигрывaет $listBot\nВы проиграли!!!"
            }
    }
    return "Ничья"
}

