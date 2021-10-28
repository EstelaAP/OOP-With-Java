package com.ucreativa.oop.presupuesto;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        System.out.println("Que quiere usar? Fake(F) Real(R)");
        InterfaceRegistro registro;
        if(consola.nextLine().equals("F")){
            registro = new ImplementacionSuperDummy();
        } else {
            registro = new ImplementacionRegistro();

        }

        while (siga){
            System.out.println("Digite el nombre de su movimiento");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda");
            String moneda = consola.nextLine();

            System.out.println("Digite el nombre la categoria");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto");
            String montoStr = consola.nextLine();

            System.out.println("Indique si es un gasto (G) o un ingreso (I)");
            if (consola.nextLine().equals("G")){
                registro.addGasto(nombre, moneda, categoria, montoStr);

            } else {
                System.out.println("Especifique la periodicidad");
                String periodicidad = consola.nextLine();
                registro.addIngreso(nombre, moneda,
                    categoria, montoStr, periodicidad);
            }

        System.out.println("Todos los movimientos:");
        registro.getMovimientos();
        }
        System.out.println("Solo gastos:");
        registro.getGastos();

        System.out.println("Quiere seguir?(S)");
            siga = consola.nextLine().equals("S");

    }

    }
