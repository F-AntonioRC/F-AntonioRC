fun main() {

    println(potencia(5, 2))

}


    fun potencia(numero: Int, exponente : Int ): Int{

        if (exponente == 0){ // PRIMER CASO
            return 1; //TODO NUMERO CON EXPONENTE 0 ES = 1
        }else if (exponente == 1) { // SEGUNDO CASO
            return numero; //PRIMERA POTENCIA
        } else {
            return numero * potencia(numero, exponente - 1); //EXPONENTE POSITIVO
        }


    }
