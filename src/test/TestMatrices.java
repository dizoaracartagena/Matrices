package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 3;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 1;
        
        System.out.println("edades 0,0 = " + edades[0][0]);
        System.out.println("edades 0,1 = " + edades[0][1]);
        System.out.println("edades 1,0 = " + edades[1][0]);
        System.out.println("edades 1,1 = " + edades[1][1]);
        
        for(int i = 0;i < edades.length;i++) {
            for(int j = 0;j < edades[i].length;j++) {
                System.out.println("edades " + i + " - " + j + " = " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
        
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Luis");
        personas[1][0] = new Persona("Rodrigo");
        personas[1][1] = new Persona("Santos");
        personas[1][2] = new Persona("Diego");
        
        System.out.println("personas 0,0 = " + personas[0][0]);
        System.out.println("personas 0,1 = " + personas[0][1]);
        System.out.println("personas 0,2 = " + personas[0][2]);
        System.out.println("personas 1,0 = " + personas[1][0]);
        System.out.println("personas 1,1 = " + personas[1][1]);
        System.out.println("personas 1,2 = " + personas[1][2]);
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
        for(int i = 0;i < matriz.length;i++) {
            for(int j = 0;j < matriz[i].length;j++) {
                System.out.println("matriz " + i + " - " + j + " = " + matriz[i][j]);
            }
        }
    }
}
