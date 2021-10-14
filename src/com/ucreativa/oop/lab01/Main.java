package com.ucreativa.oop.lab01;

public class Main {

    //#4 Métodos
    static String metodo(String variable){
       variable = variable + " Mundo";
       return variable;
    }

    public static void main(String[] args) {

        String variable = "Hola";
        variable = metodo(variable);
        System.out.println(variable);

        //#1 Comentarios
        /*
        Comentario tipo dos
         */
        // TODO: listas de cosas por hacer :D
        //#2 Variables
        // type nombre = valor;
        int entero = 5;
        float flotante = 2.5f;
        String cadenaCaracteres = "2";
        Boolean siONo=true;
        System.out.println(Integer.parseInt(cadenaCaracteres)+flotante);
        //En qué se diferencia int de interger? Primitivo vs Implementación
        //#3 Condicionales
        if(entero==2){
            System.out.println("No entro");
        }else {
            System.out.println("Si entro");
        }

        switch (entero){
            case 1:
                System.out.println("Si es uno");
                System.out.println("Que Si es uno");
                break;
            default:
                System.out.println("Default");
        }
        //Loops
        int i=0;
        while(i<10){
            System.out.println("Por aqui voy: "+ i);
            i=i+1;
        }
        //For Loop
        for (int j = 0; j < 10; j++) {
            System.out.println("Por aqui va el otro: "+ j);
        }
        //Arrays
        String[] objetos = {"Un Objeto","Dos Objetos"};
        System.out.println("Que tiene el 0: " + objetos [0]);
    }
}
