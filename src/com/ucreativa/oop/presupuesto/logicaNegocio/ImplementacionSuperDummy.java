package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Movimiento;

public class ImplementacionSuperDummy implements InterfaceRegistro {

    @Override
    public void getMovimientos() {
        System.out.println("No haga nada");
    }

    @Override
    public void addIngreso(String nombre, String moneda,
                           String categoria, String monto,
                           String periodicidad){
        System.out.println("No haga nada");
    }

    @Override
    public void addGasto(String nombre, String moneda,
                         String categoria, String monto){
        System.out.println("No haga nada");

    }

    @Override
    public void getGastos() {

    }

}
