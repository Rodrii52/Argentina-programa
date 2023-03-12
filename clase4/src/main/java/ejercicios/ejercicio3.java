package clase4.src.main.java.ejercicios;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejecicio 2: Codificacion y decodificacion de un string");

        System.out.println("Codificado: " + codificar("Texto de prueba", 5));
        System.out.println("Decodificado: " + decodificar("Yj}yt%ij%uwzjgf", 5));
    }

    static String codificar(String texto, int desplazamiento) {
        String textoCodificado = new String();

        for (char caracter : texto.toCharArray()) {
            textoCodificado += (char) (caracter + desplazamiento);
        }

        return textoCodificado;
    }

    static String decodificar(String texto, int desplazamiento) {
        String textoDecodificado = new String();

        for (char caracter : texto.toCharArray()) {
            textoDecodificado += (char) (caracter - desplazamiento);
        }

        return textoDecodificado;
    }
}