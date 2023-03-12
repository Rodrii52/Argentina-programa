package clase4.src.main.java.ejercicios;

public class ejercicio1 {
    public static void main(String[] args) {

        int[] parametros = new int[6];
        for (int base = 0; base <= args.length; base++) {
            if (base == (args.length - 1)) {
                parametros[base] = args[base] == "a"? 1 : 0;
            } else {
                parametros[base] = Integer.parseInt(args[base]);
            }
        }
        for (int number : parametros) {
            System.out.println(number);
        }


        System.out.println(args);
        System.out.println("Ejecicio A: Números ordenador de forma asc/desc");
        int[] resultado = ejercicioB(parametros);
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

    static int[] ejercicioB(int[] parametros) {
        int[] listado = new int[] { parametros[0], parametros[1], parametros[2] };
        int temp = 0;

        for (int base = 0; base < listado.length; base++) {
            for (int siguiente = base + 1; siguiente < listado.length; siguiente++) {
                temp = listado[base];

                if ((listado[base] > listado[siguiente] && parametros[3] == 1) || (listado[base] < listado[siguiente] && parametros[3] == 0)) {
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