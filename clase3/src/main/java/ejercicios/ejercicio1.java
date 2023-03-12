package clase3.src.main.java.ejercicios;

public class ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Ejecicio A: Contador de letra en un String");
        System.out.println(ejercicioA("Testeando mensaje", 'e'));

        System.out.println("Ejecicio B: Números ordenador de forma asc/desc");
        int[] resultado = ejercicioB(4, 1, 8, true);
        for (int number : resultado) {
            System.out.println(number);
        }

        System.out.println("Ejecicio C: Sumatoria de todos los números en lista > comparador");
        System.out.println(ejercicioC(new int[] { 1, 3, 5, 7, 9, 11 }, 6));
    }

    static int ejercicioA(String textoCompleto, char letraABuscar) {
        int cantidad = 0;

        for (char letra: textoCompleto.toCharArray()) {
            if (letraABuscar == letra) {
                cantidad++;
            }
        }

        return cantidad;
    }

    static int[] ejercicioB(int numero1, int numero2, int numero3, boolean ascendente) {
        int[] listado = new int[] { numero1, numero2, numero3 };
        int temp = 0;

        for (int base = 0; base < listado.length; base++) {
            for (int siguiente = base + 1; siguiente < listado.length; siguiente++) {
                temp = listado[base];

                if ((listado[base] > listado[siguiente] && ascendente) || (listado[base] < listado[siguiente] && !ascendente)) {
                    listado[base] = listado[siguiente];
                    listado[siguiente] = temp;
                }
            }
        }
        return listado;
    }

    static int ejercicioC(int[] listado, int comparador) {
        int resultado = 0;

        for (int numero : listado) {
            if (numero > comparador) {
                resultado += numero;
            }
        }

        return resultado;
    }
}