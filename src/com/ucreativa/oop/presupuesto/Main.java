package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);

        boolean siga = true;
        RegistroGastos registro = new RegistroGastos();
        while (siga){

        System.out.println("Digite el nombre de su gasto");
        String nombre = consola.nextLine();

        System.out.println("Digite la moneda");
        String moneda = consola.nextLine();

        System.out.println("Digite el nombre la categoria");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);

        Gasto nuevoGasto = new Gasto(nombre, moneda, categoria, monto);


        registro.addGastos(nuevoGasto);

        for (Gasto gastico : registro.getGastos()) {
            System.out.println(gastico.getNombre());
        }

        System.out.println("Quiere seguir?(S)");
            siga = consola.nextLine().equals("S");

    }
}
}
