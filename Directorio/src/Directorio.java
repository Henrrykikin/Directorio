import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Directorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        do {
            System.out.println("DIRECTORIO");
            System.out.println("Elige la opción deseada:\n1. Alta de contacto\n2. Búsqueda de contacto\n3. Modificación de contacto\n4. Eliminación de contacto\n0. Salir");
            //System.out.println("Ingresa un valor: ");
            int opcion = teclado.nextInt();
            int i=0;
            String nomArray[];
            nomArray = new String[50];
            Arrays nombre[];
            Arrays apellido[];
            Arrays telefono[];
            Arrays email;

            switch (opcion){
                case 0:
                    System.out.println("CERRANDO AGENDA");
                    break;
                case 1:
                    nomArray = new String[50];
                    System.out.println("NUEVO CONTACTO\nIngresa el nombre: ");
                    Arrays nomArray = teclado.hasNextLine();
                    break;
                case 2:
                    System.out.println("BUSCAR CONTACTO");
                    break;
                case 3:
                    System.out.println("EDITAR CONTACTO");
                    break;
                case 4:
                    System.out.println("ELIMINAR CONTACTO");
                    break;
                default:
                    System.out.println("NINGUNA OPCIÓN RECONOCIDA INTENTA DE NUEVO");
                    break;
            }
            /*if(opcion == 1){
                System.out.println("NUEVO CONTACTO");

            } else if (opcion == 2) {
                System.out.println("BUSCAR CONTACTO");

            } else if (opcion == 3) {
                System.out.println("EDITAR CONTACTO");

            } else if (opcion == 4) {
                System.out.println("ELIMINAR CONTACTO");

            } else
                System.out.println("NINGUNA OPCIÓN RECONOCIDA");*/

        } while (cont != 0);


        /*Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        *//*int i = 0;
        Arrays nombre[]=null;
        Arrays aPaterno []=null;*//*
        do{
            //int i = 0;
            System.out.println("DIRECTORIO");
            System.out.println("Elige la opción deseada:\n1. Alta de contacto\n2. Búsqueda de contacto\n3. Modificación de contacto\n4. Eliminación de contacto\n0. Salir");
            Scanner opcion = new teclado.next();

            switch (opcion = 0){
                case 1:
                    *//*System.out.println("Ingresa el(los) nombre(s) de tu contacto: ");
                    Scanner nombre = new teclado.next();

                    System.out.println("Ingresa los apellidos de tu contacto: ");
                    Scanner aPaterno = new teclado.next();
                    i++;*//*
                    break;
                case 2:
                   *//* System.out.println("Elige la opción adecuada para lo que quieres realizar:\1. ");

                    switch (opcion != 0){

                    }*//*
            }
        } while(opcion != 0);*/
    }
}
