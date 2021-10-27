package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.entidades.RegistroMovimientos;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);

        boolean siga = true;
        RegistroMovimientos registro = new RegistroMovimientos();
        while (siga){

        System.out.println("Digite el nombre de su movimiento ");
        String nombre = consola.nextLine();

        System.out.println("Digite la moneda");
        String moneda = consola.nextLine();

        System.out.println("Digite el nombre la categoria");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);

        Movimiento nuevoMovimiento;

        System.out.println("Indique si es un gasto (G) o un ingreso (I)");
        if (consola.nextLine().equals("G")){
            nuevoMovimiento = new Gasto(nombre, moneda, categoria, monto);
        }else {
            System.out.println("Especifique la periodicidad");
            String periodicidad = consola.nextLine();
            nuevoMovimiento = new Ingreso(nombre, moneda,
                    categoria, monto, periodicidad);

        }

        registro.addMovimiento(nuevoMovimiento);

        System.out.println("Todos los movimientos:");

        for (Movimiento movimientos : registro.getMovimientos()) {
            System.out.println(movimientos.getNombre());
        }
        System.out.println("Solo gastos:");
        for (Movimiento gastico : registro.getGastos()) {
            System.out.println(gastico.getNombre());
        }

        System.out.println("Quiere seguir?(S)");
            siga = consola.nextLine().equals("S");

    }
}
}
