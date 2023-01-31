import kotlin.math.pow

fun triangle(col: Int){

    try{
        val f: Double = readLine()!!.toDouble()
        val s: Int = readLine()!!.toInt()

        val f1: Double = readLine()!!.toDouble()
        val s1: Double = readLine()!!.toDouble()

        val f2: Double = readLine()!!.toDouble()
        val s2: Double = readLine()!!.toDouble()

        val a = ((f1 - f).pow(2.0) - (s1 - s).pow(2.0)).pow(0.5)
        val b = ((f2 - f1).pow(2.0) - (s2 - s1).pow(2.0)).pow(0.5)
        val c = ((f - f2).pow(2.0) - (s - s2).pow(2.0)).pow(0.5)

        val p = (a + b + c) / 2
        val pl = (p * (p - a) * (p - b) * (p - c)).pow(0.5)

        Color.color_text("Периметр: " + p, col)
        Color.color_text("Площадь: " + pl, col)

    }catch (e: Exception){
        println(e)
    }
}


fun main(args: Array<String>) {
    println("Введите цвет от 0 до 3: ")
    val col: Int  = readLine()!!.toInt()
    var usingColor: Int = 0

    when (col){
        0 -> usingColor = 0
        1 -> usingColor = 1
        2 -> usingColor = 2
        3 -> usingColor = 3
    }

    triangle(usingColor)
}