fun anadirContacto(): Any {
    val acontactos: ArrayList<String> = arrayListOf<String>()
    println("Introduce nombre nuevo contacto: ")
    var nombre:String= readln().toString()
    acontactos.add(nombre)
    println("Introduce un telefono:")
    var telefono:Int= readln().toInt()
    acontactos.add(telefono.toString())
    return acontactos
}

fun listarContacto() {

}

fun existeContacto() {

}


fun eliminarContacto() {

}

fun contactosDisponibles() {

}

fun buscarContacto() {

}

fun agendaLlena() {

}

fun salir() {

}

fun main() {

    var opcion:Int = readln().toInt();

    while (opcion != 8){

        println("1.Añadir Contacto");
        println("2.Listar Contacto");
        println("3.Buscar Contacto");
        println("4.Existe Contacto");
        println("5.Eliminar Contacto");
        println("6.Contactos Disponibles");
        println("7.Agenda llena");
        println("8.Salir");
        println("Escribe una de las opciones");
        opcion=readln().toInt();
        when (opcion) {

            if (opcion == 1) {
                anadirContacto()
            } else if (opcion == 2) {
                listarContacto()
            } else if (opcion == 3) {
                buscarContacto()
            } else if (opcion == 4) {
                existeContacto()
            } else if (opcion == 5) {
                eliminarContacto()
            } else if (opcion == 6) {
                contactosDisponibles()
            } else if (opcion == 7) {
                agendaLlena()
            } else (opcion == 8){


                salir()
                }
            }

        }
    }



