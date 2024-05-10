import java.util.*

// Unit es similar a void en Java

fun imprimirNombre(nombre:String){
    println("Nombre: ${nombre}")
}

fun calcularSueldo(
    sueldo: Double, //Requrido
    tasa:Double = 12.00, //Opcional, defecto
    bonoEspecial: Double?=null// Es Nullable
):Double{
    if(bonoEspecial == null){
        return sueldo * (sueldo/100)
    }else{
        return sueldo * (100/tasa) * bonoEspecial
    }
}
fun main() {


    println("hola mundo")
    //Inmutables (no se puede RE ASIGNAR "="
    val inmutable: String = "Adrian"

    //Mutables
    var mutable: String = "Jose"
    mutable = "Teran"
    println(mutable)

    //Duck typing
    var ejemploVariable = "Jose Teran"
    val edadEjemplo: Int = 4
    ejemploVariable.trim()

    //Variable primitivas
    val nombre: String = "Jose"
    val sueldo: Double = 1.2
    val estadoCivil: Char = 'C'
    val mayorDeEdad: Boolean = true
    //Clases Java
    val fechaNacimiento: Date = Date()


    //clase 10 de mayo

    when (estadoCivil) {
        ('C') -> {
            println("Casado")
        }

        'S' -> {
            println("Soltero")
        }

        else -> {
            println("No sabemos")
        }
    }

    calcularSueldo(12.00)// El siempre requerido
    calcularSueldo(
        12.00,
        bonoEspecial = 40.0
    ) // Quiero manda parametro 1 y 3 (sueldo, tasa, bonoEspecial)
    calcularSueldo(bonoEspecial = 40.00, tasa = 12.0, sueldo = 30.0)

}

abstract class NumerosJava{
    protected val numeroUno:Int
    private val numeroDos: Int
    constructor(
        uno:Int,
        dos:Int
    ){
        this.numeroUno = uno
        this.numeroDos = dos
        print("Inicializado")
    }


    abstract class Numeros(
        protected val numeroUno: Int,
        protected val numeroDos: Int,
    ){
        init {
            this.numeroUno
            this.numeroDos
            println("Inicializando")
        }
    }

    class Suma(
        unoParametro: Int,
        dosParametro: Int
    ): Numeros(
        unoParametro,
        dosParametro
    ){
        public val soyPublicoExplicito: String = "Explicito"
        val soyPublicoImplicito:String= "Implicito"

        init {
            this.numeroUno
            this.numeroDos
            numeroUno //el  this es OPCIONAL
            numeroDos// el this es OPCIONAL
        }
    }

    //devolvel la suma de dos numero
    //Companion object: comparte entre todas las instancias, compartir
    fun sumar():Int{
        val total = numeroUno + numeroDos
        //agregarHistorial(total)
        return total
    }
    companion object {
        val pi =3.16
        fun elevarAlCuadrado(num:Int):Int{
            return num*num
        }
        //val historialSumas = arrayListOf<Int>{}
    }


}