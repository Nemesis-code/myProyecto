
package com.umg.proyectofisica;

import java.util.Scanner;

public class ConversionMedidas {
    
    
    
    public static double convertirLongitud(double valor, String desde, String hasta) {
        double factores[] = {1, 1000, 1609.34, 0.3048, 0.01, 0.0254};
        String unidades[] = {"metros", "kilómetros", "millas", "pies", "centímetros", "pulgadas"};
        return valor * (factores[buscarIndice(unidades, desde)] / factores[buscarIndice(unidades, hasta)]);
    }
    
    public static double convertirMasa(double valor, String desde, String hasta) {
        double factores[] = {1, 0.001, 0.453592, 0.0283495};
        String unidades[] = {"kilogramo", "gramo", "libra", "onzas"};
        return valor * (factores[buscarIndice(unidades, desde)] / factores[buscarIndice(unidades, hasta)]);
    }
    
    public static double convertirTiempo(double valor, String desde, String hasta) {
        double factores[] = {1, 60, 3600, 86400, 31536000};
        String unidades[] = {"segundos", "minutos", "horas", "días", "años"};
        return valor * (factores[buscarIndice(unidades, desde)] / factores[buscarIndice(unidades, hasta)]);
    }
    
    public static int buscarIndice(String[] array, String valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(valor)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la categoría de conversión:");
        System.out.println("1. Longitud");
        System.out.println("2. Masa");
        System.out.println("3. Tiempo");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        String[] medidas = {};
        if (opcion == 1) {
            medidas = new String[]{"metros", "kilómetros", "millas", "pies", "centímetros", "pulgadas"};
        } else if (opcion == 2) {
            medidas = new String[]{"kilogramo", "gramo", "libra", "onzas"};
        } else if (opcion == 3) {
            medidas = new String[]{"segundos", "minutos", "horas", "días", "años"};
        } else {
            System.out.println("Opción no válida.");
            return;
        }
        
        System.out.println("Opciones de medida:");
        for (int i = 0; i < medidas.length; i++) {
            System.out.println((i + 1) + ". " + medidas[i]);
        }
        
        System.out.print("Seleccione la medida de origen: ");
        String desde = medidas[scanner.nextInt() - 1];
        System.out.print("Seleccione la medida de destino: ");
        String hasta = medidas[scanner.nextInt() - 1];
        
        System.out.print("Ingrese el valor numérico a convertir: ");
        double valor = scanner.nextDouble();
        
        double resultado = 0;
        if (opcion == 1) {
            resultado = convertirLongitud(valor, desde, hasta);
        } else if (opcion == 2) {
            resultado = convertirMasa(valor, desde, hasta);
        } else if (opcion == 3) {
            resultado = convertirTiempo(valor, desde, hasta);
        }
        
        System.out.printf("%.2f %s equivale a %.5f %s\n", valor, desde, resultado, hasta);
    }
    
}
