package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] =  new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 22;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 48;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3] = 5;
        
        for(int i = 0;i < edades.length;i++) {
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }
        
        String frutas[] = {"Pera", "Naranja", "Manzana", "Uva"};
        
        for(int i = 0;i < frutas.length;i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }
    }
}
