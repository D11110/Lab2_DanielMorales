package lab2_danielmorales;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_DanielMorales {

    static Scanner input = new Scanner(System.in);
    static ArrayList Casas = new ArrayList();
    static boolean Auth = false;

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1. Registro de casas");
            System.out.println("2. Manejo de estados");
            System.out.println("3. Log in");
            System.out.println("4. Salir");

            int op = input.nextInt();

            switch (op) {
                case 1: {
                    if (Auth) {
                        System.out.println("Menu secundario");
                        System.out.println("1. Crear casas");
                        System.out.println("2. Listar casas");
                        System.out.println("3. Modificar casas");
                        System.out.println("4. Borrar casas");
                        int op1 = input.nextInt();
                        switch (op1) {
                            case 1:
                                System.out.println("La casa ya fue comprada anteriormente? (s/n)");
                                char prev_ow_check = input.next().charAt(0);
                                if (prev_ow_check == 's') {
                                    System.out.println("Ingrese numero de casa:");
                                    int num_casa = input.nextInt();
                                    System.out.println("Ingrese numero de bloque");
                                    int num_bloque = input.nextInt();
                                    System.out.println("Ingrese color:");
                                    String color = input.next();
                                    System.out.println("Ingrese el ancho:");
                                    int ancho = input.nextInt();
                                    System.out.println("Ingrese el largo:");
                                    int largo = input.nextInt();
                                    System.out.println("Ya ha sido comprada? (s/n)");
                                    char compradaChar = input.next().charAt(0);
                                    boolean comprada;
                                    if (compradaChar=='s') {
                                        comprada=true;
                                    } else{
                                        comprada =false;
                                    }
                                    System.out.println("Ingrese numero de pisos:");
                                    int num_pisos = input.nextInt();
                                    System.out.println("Ingrese numero de baths: ");
                                    int num_bath = input.nextInt();
                                    System.out.println("Ingrese numero de cuartos: ");
                                    int num_cuartos = input.nextInt();
                                    System.out.println("Ingrese el nombre del dueno anterior:");
                                    String prev_owner = input.nextLine();
                                    prev_owner = input.nextLine();
                                    System.out.println("Ingrese el estado: ");
                                    String estado = input.nextLine();
                                    System.out.println("Ingrese el nombre del Ing a cargo: ");
                                    String nombre_ing = input.nextLine();
                                    Casas c = new Casas(num_casa, num_bloque, color, ancho, largo, comprada, num_pisos, num_bath, num_cuartos, prev_owner, estado, nombre_ing);
                                    Casas.add(c);
                                } else if(prev_ow_check =='n'){
                                    System.out.println("Ingrese numero de casa:");
                                    int num_casa = input.nextInt();
                                    System.out.println("Ingrese numero de bloque");
                                    int num_bloque = input.nextInt();
                                    System.out.println("Ingrese color:");
                                    String color = input.next();
                                    System.out.println("Ingrese el ancho:");
                                    int ancho = input.nextInt();
                                    System.out.println("Ingrese el largo:");
                                    int largo = input.nextInt();
                                    System.out.println("Ya ha sido comprada? (s/n)");
                                    char compradaChar = input.next().charAt(0);
                                    boolean comprada;
                                    if (compradaChar=='s') {
                                        comprada=true;
                                    } else{
                                        comprada =false;
                                    }
                                    System.out.println("Ingrese numero de pisos:");
                                    int num_pisos = input.nextInt();
                                    System.out.println("Ingrese numero de baths: ");
                                    int num_bath = input.nextInt();
                                    System.out.println("Ingrese numero de cuartos: ");
                                    int num_cuartos = input.nextInt();
                                    System.out.println("Ingrese el estado: ");
                                    String estado = input.nextLine();
                                    estado = input.nextLine();
                                    System.out.println("Ingrese el nombre del Ing a cargo: ");
                                    String nombre_ing = input.nextLine();
                                    CasasNuevas c = new CasasNuevas(num_casa, num_bloque, color, ancho, largo, comprada, num_pisos, num_bath, num_cuartos, estado, nombre_ing);
                                    Casas.add(c);
                                }
                               
                                break;
                            case 2: 
                                mostrar();
                                break;
                            case 3:
                                mostrar();
                                
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else{
                        System.out.println("Su usuario no ha sido autenticado");
                    }

                }
                break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese el usuario: ");
                    String usuario = input.next();
                    if (usuario.equals("leobanegas")) {
                        System.out.println("Ingrese la contra:");
                        int pass = input.nextInt();
                        if (pass==99) {
                            Auth = true;
                            System.out.println("Usuario autenticado.");
                        } else {
                            System.out.println("Password incorrecta");
                        }
                    } else {
                        System.out.println("Usuario incorrecto");
                    }
                    break;

                default:
                    System.exit(0);
            }
        }

    }

    public static void mostrar() {

        for (int i = 0; i < Casas.size(); i++) {
            System.out.print(i + "=" + Casas.get(i) + "\n");
        }
    }
}
