package clase1;

public class ejercicio2 {
    public static void main(String[] args) {
        /*
            Variables de entrada:
                - int ingresoMensualTotal : Ingresos mensuales totales
                - short cantidadVehiculos : Cantidad de vehiculos>=3 con antigüedad < 5
                - short cantidadInmuebles : Cantidad de inmuebles>=3
                - boolean capacidadEconomicaPlena : Tiene embarcación/aeronave/activos/societarios

            Variables de salida:
                - boolean poseeIngresosAltos : Pertenece al segmento de ingresos altos
         */

        System.out.println("Ejecicio 2: Determinar si pertenece al segmento de ingresos altos");

        int ingresoMensualTotal = 100000;
        short cantidadVehiculos = 2;
        short cantidadInmuebles = 1;
        boolean capacidadEconomicaPlena = false;

        boolean poseeIngresosAltos = (ingresoMensualTotal >= 489083 || cantidadVehiculos >= 3 || cantidadInmuebles >= 3 || capacidadEconomicaPlena);

        System.out.println("Usted %s pertenece al segmento de ingresos altos".formatted(poseeIngresosAltos? "SI" : "NO"));
    }
}