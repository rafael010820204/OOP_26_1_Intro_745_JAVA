import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a>= b && a >=c) return a;
        if (b>=c) return b;
        return c;
    }

    // Implementar tablaMultiplicar
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        for(int i = 0; i < limite; i++){
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }


    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0){
            throw new IllegalArgumentException("El número no debe ser negativo");
        }
        int resultado = 1;

        for (int i = 2; i <= n; i++ ){
            resultado *= i;
        }
        return resultado;
    }

    // Método esprimo
    public boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método serieFibonacci
    public int[] serieFibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }

        int[] serie = new int[n];

        if (n > 0) {
            serie[0] = 0;
        }

        if (n > 1) {
            serie[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        return 0;
    }

    // Método promedioelementos
    public double promedioElementos(int[] arreglo) {

        int suma = 0;
        int contador = 0;

        for (int num : arreglo) {
            suma += num;
            contador++;
        }

        return (double) suma / contador;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {

        int mayor = arreglo[0];

        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {

        int menor = arreglo[0];

        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {

        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }

        return false;
    }
    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {

        int[] invertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }


    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                }
            }
        }

        return arreglo;
    }


    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {

        int[] temp = new int[arreglo.length];
        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (arreglo[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                temp[contador] = arreglo[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temp[i];
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {

        int[] resultado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {

        int n = arreglo.length;

        if (n == 0) {
            return arreglo;
        }

        int[] resultado = new int[n];

        posiciones = posiciones % n;

        for (int i = 0; i < n; i++) {
            int nuevaPos = (i + posiciones + n) % n;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;
    }


    import java.util.Scanner;

    //Metodo para contar los caracteres en una cadena
    public class ContadorCaracteres {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Escribe algo: ");
            String texto = teclado.nextLine();
            int cantidad = texto.length();
            System.out.println("El texto tiene " + cantidad + " caracteres.");
            teclado.close();
        }
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {

        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }

        return resultado;
    }


    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {

        cadena = cadena.toLowerCase().replace(" ", "");

        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        return cadena.equals(invertida);
    }
    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {

        if (cadena.equals("")) {
            return 0;
        }

        int contador = 1;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;
    }

    // Método que convierte una cadena a mayúsculas
    import java.util.Scanner;
    public class ConvertidorMayusculas {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce el texto que quieras transformar: ");
            String original = teclado.nextLine();
            String resultado = original.toUpperCase();
            System.out.println("Resultado: " + resultado);
            teclado.close();
        }
    }

    // Método que convierte una cadena a minúsculas
    import java.util.Scanner;
    public class ConvertidorMinusculas {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce el texto en MAYÚSCULAS: ");
            String original = teclado.nextLine();
            String resultado = original.toLowerCase();
            System.out.println("Resultado: " + resultado);
            teclado.close();
        }
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) {
            return -1;
        }

        return cadena.indexOf(subcadena);
    }
    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;

        // Debe tener @
        if (!correo.contains("@")) return false;

        // No debe tener espacios
        if (correo.contains(" ")) return false;

        // Solo caracteres básicos permitidos
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com");
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0.0;
        }

        double suma = 0;

        for (int num : lista) {
            suma += num;
        }

        return suma / lista.size();
    }
    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        if (numero < 0) {
            return "-" + Integer.toBinaryString(-numero);
        }

        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero == 0) {
            return "0";
        }

        if (numero < 0) {
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        return "Empate";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}



}

