fun main() {
    println("ingresa el primer numero: ")
    val n1 = readLine()!!.toInt()

    println("ingresa el segundo numero: ")
    val n2 = readLine()!!.toInt()

    println("ingresa el tercero numero: ")
    val n3 = readLine()!!.toInt()

    val ex1 = ExerciseOne(n1, n2, n3)
    ex1.maymen()
}

class ExerciseOne(num1:Int, num2:Int, num3:Int){
    var num1=0
    var num2=0
    var num3=0

    init{
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
    }

    fun maymen(){
        val arreglo = arrayOf(num1, num2, num3)
        var temp = 0
        for (i in (0 until arreglo.size-1)){
            for (j in (0 until arreglo.size-1)){
                if (arreglo[j] > arreglo[j+1]){
                    temp = arreglo[j]
                    arreglo[j] = arreglo[j+1]
                    arreglo[j+1] = temp
                }
            }
        }
        //for (i in (0 until arreglo.size)) println(arreglo[i])
        println("El número Menor es: ${arreglo.get(0)}")
        println("El número Mayor es: ${arreglo.get(arreglo.size-1)}")
    }
}