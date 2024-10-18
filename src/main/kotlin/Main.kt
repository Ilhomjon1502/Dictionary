import java.util.Scanner

fun main(args: Array<String>) {

    val wordList = arrayOfNulls<MyWord>(100)
    val input = Scanner(System.`in`)
    var count = 0

    while (true){
        println("1->so'z qo'shish; 2-> ko'rish; 3->qidirish")
        val n = input.nextInt()
        when(n){
            1->{
                println("Yangi so'z kiriting:")
                val e = input.next()
                println("Tarjimasini kiriting: ")
                val u = input.next()

                val myWord = MyWord()
                myWord.english = e
                myWord.uzbek = u

                wordList[count] = myWord
                count++
                println("Saqlandi")
            }
            2->{
                for (i in 0 until count){
                    println(wordList[i])
                }
            }
            3->{
                println("Qidirmoqchi bo'lgan so'zingizni kiriting: ")
                val searchWord = input.next()

                var topildimi = false

                for (i in 0 until count){
                    if (wordList[i]?.english!!.contains(searchWord) || wordList[i]?.uzbek!!.contains(searchWord)){
                        println("${wordList[i]}")
                        topildimi = true
                    }
                }

                if (!topildimi){
                    println("so'z topilmadi")
                }
            }
        }
    }

}