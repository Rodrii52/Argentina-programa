package clase4.src.main.java.ejercicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Se requieren dos argumentos: la ruta del archivo y la operación a realizar (suma o multiplicacion).");
            return;
        }
        String filePath = args[0];
        String operation = args[1];
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int result = 0;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String number : numbers) {
                    int num = Integer.parseInt(number);
                    if (operation.equals("suma")) {
                        result += num;
                    } else if (operation.equals("multiplicacion")) {
                        result *= num;
                    } else {
                        System.out.println("Operación no válida. Debe ser 'suma' o 'multiplicacion'.");
                        return;
                    }
                }
            }
            System.out.printf("El resultado de la operación %s es: %d\n", operation, result);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo debe contener solo números enteros.");
        }
    }
}