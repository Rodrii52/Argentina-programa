package clase1;

public class ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Ejecicio A: Rango de números con while");
        ejercicioA();
        System.out.println("Ejecicio B: Números pares");
        ejercicioB();
        System.out.println("Ejecicio C: Números pares/impares con variable");
        ejercicioC();
        System.out.println("Ejecicio D: Números impares");
        ejercicioD();
    }

    static void ejercicioA() {
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio++;
        }
    }

    static void ejercicioB() {
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
    }

    static void ejercicioC() {
        int numeroInicio = 5;
        int numeroFin = 14;
        boolean numerosPares = false;

        while (numeroInicio <= numeroFin) {
            if ((numeroInicio % 2 == 0 && numerosPares) || (numeroInicio % 2 != 0 && !numerosPares)) {
                System.out.println(numeroInicio);
            }

            numeroInicio++;
        }
    }
    static void ejercicioD() {
        int numeroInicio = 5;
        int numeroFin = 14;

        for (int contador = numeroInicio; contador <= numeroFin; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }
    }

}