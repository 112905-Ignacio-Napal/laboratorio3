package clase2;

import java.util.Scanner;

/**
 *
 * @author inapal
 */
public class Clase2 {
    public static void main(String[] args) {
        
//        //Ejercicio 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el sueldo por hora");
        double sueldoPorHora = scanner.nextDouble();
        double sueldoFinal;
        double sueldoExtra;
        if(horasTrabajadas > 180){
            double sueldoBasico = 180 * sueldoPorHora;
            
            int horasExcedentes = horasTrabajadas - 180;
            double sueldoPorHoraAumentado = sueldoPorHora * 1.5;
            sueldoExtra = horasExcedentes * sueldoPorHoraAumentado;
            
            sueldoFinal = sueldoBasico + sueldoExtra;
        }else{
            sueldoFinal = horasTrabajadas * sueldoPorHora;
        }
        
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Sueldo por hora: " + sueldoPorHora);
        System.out.println("Sueldo Final: " + sueldoFinal);
        /////////////////////////////////////////////////////////////
        
        //Ejercicio 8
        System.out.println("Ingrese 10 numeros");
        int suma = 0;
        for(int i = 0; i < 10;i++){
            System.out.println("Ingrese el " + (i+1) + " numero");
            suma += scanner.nextInt();
        }
        float promedio = suma / 10F;
        System.out.println("La suma de los 10 numeros es: " + suma);
        System.out.println("El promedio es: " + promedio);
        
        /////////////////////////////////////////////////////////////
        
        //Ejercicio 12
        int cantTotalAutos = 0;
        int cantAutosPocoUso = 0;
        int cantMuyAntiguos = 0;
        int sumaAntiguedadMuyAntiguos = 0;
        int sumaAntiguedadTotal = 0;
        
        while(true){
            System.out.println("Ingrese la antiguedad del auto");
            int antiguedad = scanner.nextInt();
            if(antiguedad < 1) break;
            
            if(antiguedad <= 5){
                System.out.println("NUEVO");
            }else if(antiguedad <= 10){
                System.out.println("POCO USO");
                cantAutosPocoUso++;
            }else if(antiguedad <= 20){
                System.out.println("MUCHO USO");
            }else{
                 System.out.println("MUY ANTIGUO");
                 cantMuyAntiguos++;
                 sumaAntiguedadMuyAntiguos+= antiguedad;
            }
            sumaAntiguedadTotal+=antiguedad;
            cantTotalAutos++;
            continue;
        }
        
        int cantidadNoMuyAntiguos = cantTotalAutos -  cantMuyAntiguos;
        int sumaAntiguedadNoMuyAntiguos = sumaAntiguedadTotal - sumaAntiguedadMuyAntiguos;
        
        double promedioNoMuyAntiguos = (double)sumaAntiguedadNoMuyAntiguos / cantidadNoMuyAntiguos;
        System.out.println("Cantidad total de autos: " + cantTotalAutos);
        System.out.println("Cantidad de autos con poco uso: " + cantAutosPocoUso);
        System.out.println("Promedio de antiguedad de los autos que no son 'muy antiguos': " + promedioNoMuyAntiguos);
        
    }
    
}
