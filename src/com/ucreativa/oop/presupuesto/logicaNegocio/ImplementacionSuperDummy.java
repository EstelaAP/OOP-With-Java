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

    @Override
    public void addIngreso(String text, String text1, String text2, String text3) {

    }

    @Override
    public void addGasto() {

    }

    @Override
    public void addGasto(String text, String text1, String text2) {

    }

}
