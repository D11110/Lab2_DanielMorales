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
                                    if (compradaChar == 's') {
                                        comprada = true;
                                    } else {
                                        comprada = false;
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
                                } else if (prev_ow_check == 'n') {
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
                                    if (compradaChar == 's') {
                                        comprada = true;
                                    } else {
                                        comprada = false;
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

                                System.out.println("Que casa desea modificar?");
                                int opcion1 = input.nextInt() - 1;
                                System.out.println("1. Numero de casa");
                                System.out.println("2. Numero de bloque");
                                System.out.println("3. Color");
                                System.out.println("4. Ancho");
                                System.out.println("5. Largo");
                                System.out.println("6. Estado de comprada");
                                System.out.println("7. Numero de pisos");
                                System.out.println("8. Numero de bathrooms");
                                System.out.println("9. Numero de cuartos");
                                System.out.println("10. Nombre de Ing a cargo");
                                int opcion2 = input.nextInt();
                                switch (opcion2) {
                                    case 1: {
                                        int pos31 = opcion1;
                                        System.out.println("Ingrese el nuevo numero de casa:");
                                        int num_casa = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(pos31)).setNum_casa(num_casa);
                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(pos31)).setNum_casa(num_casa);
                                        }
                                    }
                                    break;
                                    case 2: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo numero de bloque:");
                                        int num_bloque = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setNum_bloque(num_bloque);
                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setNum_bloque(num_bloque);
                                        }

                                    }

                                    break;
                                    case 3: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo color:");
                                        String color = input.next();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setColor(color);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setColor(color);
                                        }
                                    }
                                    break;
                                    case 4: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo ancho:");
                                        int ancho = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setAncho(ancho);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setAncho(ancho);
                                        }
                                    }
                                    break;
                                    case 5: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo largo:");
                                        int largo = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setLargo(largo);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setLargo(largo);
                                        }
                                    }
                                    break;
                                    case 6: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo estado: 0=no comprada 1=comprada ");
                                        int compra = input.nextInt();
                                        boolean comprada = false;
                                        if (compra == 0) {
                                            comprada = false;
                                        } else if (compra == 1) {
                                            comprada = true;
                                        }
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setComprada(comprada);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setComprada(comprada);
                                        }
                                    }
                                    break;
                                    case 7: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese el nuevo numero de pisos:");
                                        int num_pisos = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setNum_pisos(num_pisos);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setNum_pisos(num_pisos);
                                        }
                                    }
                                    break;
                                    case 8: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese la nueva cantidad de bathrooms: ");
                                        int num_bath = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setNum_bath(num_bath);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setNum_bath(num_bath);
                                        }
                                    }
                                    break;
                                    case 9: {
                                        int poss = opcion1;
                                        System.out.println("Ingrese la nueva cantidad de cuartos: ");
                                        int num_cuartos = input.nextInt();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setNum_cuartos(num_cuartos);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setNum_cuartos(num_cuartos);
                                        }
                                    }
                                    break;
                                    case 10: {
                                        int poss= opcion1;
                                        System.out.println("Ingrese el nuevo nombre del Ing a cargo:");
                                        String nombre_ing = input.nextLine();
                                        if (Casas.get(opcion1) instanceof Casas) {
                                            ((Casas) Casas.get(poss)).setNombre_ing(nombre_ing);

                                        } else if (Casas.get(opcion1) instanceof CasasNuevas) {
                                            ((CasasNuevas) Casas.get(poss)).setNombre_ing(nombre_ing);
                                        }
                                    }
                                    break;
                                    default:
                                        System.out.println("Entrada no valida");
                                }
                                break;
                            case 4:
                                mostrar();
                                System.out.println("Ingrese la casa que desea eliminar:");
                                int casaAElim = input.nextInt() -1;
                                Casas.remove(casaAElim);
                                break;

                            default:
                                System.out.println("Entrada no valida");
                        }
                    } else {
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
                        if (pass == 99) {
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
            System.out.print(i + 1 + "=" + Casas.get(i) + "\n");
        }
    }
}
