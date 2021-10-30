package com.ucreativa.oop.presupuesto.logicaNegocio;

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
        return true;
    }

    @Override
    public boolean addGasto(String nombre, String moneda,
                         String categoria, String monto){
        System.out.println("No haga nada");
        return true;

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
