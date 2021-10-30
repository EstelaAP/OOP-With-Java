package com.ucreativa.oop.presupuesto.logicaNegocio;

public interface InterfaceRegistro {

     void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);
     boolean addGasto(String nombre, String moneda, String categoria, String montoStr);

     void getMovimientos();
     void getGastos();

     void addIngreso(String text, String text1, String text2, String text3);

     void addGasto();

     void addGasto(String text, String text1, String text2);

}
